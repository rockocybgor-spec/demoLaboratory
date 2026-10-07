-- 1. Generar el script de DROP
SET PAGESIZE 0
SET LINESIZE 200
SET FEEDBACK OFF
SET HEADING OFF
SET TRIMSPOOL ON

SPOOL drop_all_tables.sql

SELECT 'DROP TABLE ' || table_name || ' CASCADE CONSTRAINTS;'
FROM user_tables
ORDER BY table_name DESC;

SPOOL OFF

-- 2. Ejecutar el script generado
@drop_all_tables.sql

-- 3. (Opcional) Verificar que no hay tablas
SELECT table_name FROM user_tables;