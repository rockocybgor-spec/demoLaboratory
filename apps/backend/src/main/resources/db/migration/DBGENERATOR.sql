CREATE TABLE ELECTOR(
claveElector VARCHAR(18) CONSTRAINT pk_elector PRIMARY KEY,
dActaEscrutinio VARCHAR(16),
nombres VARCHAR(20) NOT NULL,
apellidoM VARCHAR(15) NOT NULL,
apellidoP VARCHAR (15) NOT NULL,
fotoCredencial BLOB NOT NULL,
haVotado BOOLEAN NOT NULL
);

CREATE TABLE CASILLA(
folioActaEscrutinio VARCHAR(16) CONSTRAINT pk_casilla  PRIMARY KEY,
seccion NUMBER NOT NULL,
fotoActaCasilla BLOB,
fotoConstanciaClausura BLOB,
fotoCartelResultados BLOB,
horaClausura DATE,
direccion VARCHAR(50),
tipo VARCHAR(10),
dFuncionarioPresidente VARCHAR(18),
dFuncionarioSecretario VARCHAR(18),
dCapturista VARCHAR(18),
dConsejoDistrital VARCHAR(18),
fotoRemisionPaqueteElectoral BLOB,
motivoCambioDocmicilio VARCHAR(50),
fotoActaInstalacion BLOB,
numeroBoletasSobrantes INTEGER,
votantesTotales INTEGER,
votosNulosAutomatizados INTEGER,
votosNulosCapturados INTEGER,
horaInicioInstalacion DATE,
CONSTRAINT dFuncionario FOREIGN KEY (dFuncionarioPresidente) REFERENCES ELECTOR (claveElector),
CONSTRAINT dFuncioarioSecretario FOREIGN KEY (dFuncionarioSecretario) REFERENCES ELECTOR (claveElector),
CONSTRAINT dCapturista FOREIGN KEY (dCapturista) REFERENCES ELECTOR (claveElector),
CONSTRAINT dConsejoDistrital FOREIGN KEY (dConsejoDistrital) REFERENCES ELECTOR (claveElector)
);

CREATE TABLE FUNCIONARIOCASILLA(
dElector VARCHAR(18) CONSTRAINT pk_funcioario PRIMARY KEY,
dCasilla VARCHAR(16) NOT NULL,
confirma BOOLEAN NOT NULL,
CONSTRAINT dElector FOREIGN KEY (dElector) REFERENCES  ELECTOR(claveElector),
CONSTRAINT dCasilla FOREIGN KEY (dCasilla) REFERENCES CASILLA(folioActaEscrutinio)
);


CREATE TABLE PARTIDO(
iduPartido VARCHAR(25) CONSTRAINT pk_partido PRIMARY KEY,
nombrePartido VARCHAR(25)NOT NULL,
siglas VARCHAR(10) NOT NULL,
emblema BLOB NOT NULL,
CONSTRAINT uq_siglas UNIQUE (siglas),
CONSTRAINT up_nombre_partido UNIQUE (nombrePartido)
);


CREATE TABLE REPRESENTANTEPARTIDO(
dElector VARCHAR(18) CONSTRAINT pk_representantePartido PRIMARY KEY,
dCasilla VARCHAR(16) NOT NULL,
dPartido VARCHAR(25) NOT NULL,
confirma BOOLEAN NOT NULL,
protesta VARCHAR(100) NOT NULL,
CONSTRAINT fk_elector_representante FOREIGN KEY (dElector) REFERENCES  ELECTOR(claveElector),
CONSTRAINT fk_casilla FOREIGN KEY (dCasilla) REFERENCES  CASILLA(folioActaEscrutinio),
CONSTRAINT fk_partido FOREIGN KEY (dPartido) REFERENCES PARTIDO(iduPartido)
);

CREATE TABLE CANDIDATO(
dElector VARCHAR(18) CONSTRAINT fk_cadidato PRIMARY KEY,
tipoCandidatura VARCHAR(30) NOT NULL,
entidad VARCHAR(30) NOT NULL,
gradoAcademico VARCHAR(30) NOT NULL,
CONSTRAINT fk_dElector FOREIGN KEY (dElector) REFERENCES  ELECTOR(claveElector)
);

CREATE TABLE CANDIDATOPARTIDO(
dCandidato  VARCHAR(18) NOT NULL,
dPartido VARCHAR(25) NOT NULL,
CONSTRAINT fk_dCandidato FOREIGN KEY (dCandidato) REFERENCES  CANDIDATO(dElector),
CONSTRAINT fk_dpartido FOREIGN KEY (dPartido) REFERENCES  PARTIDO(iduPartido),
CONSTRAINT pk PRIMARY KEY (dCandidato,dPartido)
);

CREATE TABLE VOTOSPORCANDIDATO(
dCasilla VARCHAR(16),
dCandidato VARCHAR (18),
conteoCaptura INTEGER,
conteoAutomatizado INTEGER,
CONSTRAINT fk_Candidato FOREIGN KEY (dCandidato) REFERENCES  CANDIDATO(dElector),
CONSTRAINT fk_dCasilla FOREIGN KEY (dCasilla) REFERENCES  CASILLA(folioActaEscrutinio),
CONSTRAINT id PRIMARY KEY (dCasilla, dCandidato),
CONSTRAINT CONTEOCAPTURA_POSITIVO CHECK (conteoCaptura >=0),
CONSTRAINT CONTEOAUTOMATIZADO_POSITIVO CHECK (conteoAutomatizado >=0)
);

CREATE TABLE VOTOSPORPARTIDO(
dCasilla VARCHAR(16),
dPartido VARCHAR (25),
conteoCaptura INTEGER NOT NULL,
conteoAutomatizado INTEGER NOT NULL,
CONSTRAINT fk_vP_dCasilla FOREIGN KEY (dCasilla) REFERENCES  CASILLA(folioActaEscrutinio),
CONSTRAINT fk_vP_dpartido FOREIGN KEY (dPartido) REFERENCES  PARTIDO(iduPartido),
CONSTRAINT VP_id PRIMARY KEY (dCasilla, dPartido),
CONSTRAINT VP_CONTEOCAPTURA_POSITIVO CHECK (conteoCaptura >=0),
CONSTRAINT VP_CONTEOAUTOMATIZADO_POSITIVO CHECK (conteoAutomatizado >=0)
);

CREATE TABLE BOLETA (
folioBoleta VARCHAR(20) CONSTRAINT pk_boleta PRIMARY KEY,
fotoBoleta BLOB,
dCasilla VARCHAR(16),
encabezado VARCHAR(50),
entidadFederativa VARCHAR(20) NOT NULL,
circunscripcionPlurinominal INTEGER NOT NULL,
distritoElectoral VARCHAR(20) NOT NULL,
municipioDelegacion INTEGER NOT NULL,
nulidad BOOLEAN NOT NULL,
dCandidato VARCHAR(18),
CONSTRAINT bol_dCasilla FOREIGN KEY (dCasilla) REFERENCES  CASILLA(folioActaEscrutinio),
CONSTRAINT bol_dCandidato FOREIGN KEY (dCandidato) REFERENCES  CANDIDATO(dElector)
);
//VISTAS
--LOG DE CAMBIOS PARA REFRESCO RÁPIDO INCREMENTAL
CREATE MATERIALIZED VIEW LOG ON BOLETA WITH ROWID INCLUDING NEW VALUES;

//VISTA MATERIALIZADA
CREATE MATERIALIZED VIEW MV_BOLETAS_ESTADO
BUILD IMMEDIATE
REFRESH FORCE ON DEMAND
AS
SELECT
 e.folioBoleta,
 e.fotoBoleta,
 e.nulidad,
 e.dCasilla,
 e.dCandidato,
 CASE
  WHEN e.nulidad = "FALSE" AND e.dCandidato IS NOT NULL THEN 'VALIDO'
  WHEN e.nulidad = "TRUE" THEN 'ANULADO'
  ELSE 'SOBRANTE'
  END AS estado
FROM BOLETA e
JOIN CASILLA c ON e.dCasilla = c.folioActaEscrutinio;

--JOB para refrescar cada N minutos
BEGIN
  DBMS_SCHEDULER.CREATE_JOB (
    job_name        => 'JOB_REFRESH_ESTUDIANTES',
    job_type        => 'PLSQL_BLOCK',
    job_action      => 'BEGIN DBMS_MVIEW.REFRESH(''MV_BOLETAS_ESTADO'', ''F''); END;',
    start_date      => SYSTIMESTAMP,
    repeat_interval => 'FREQ=MINUTELY; INTERVAL=60',  -- cada 5 minutos, ajusta N aquí
    enabled         => TRUE
  );
END;
/


