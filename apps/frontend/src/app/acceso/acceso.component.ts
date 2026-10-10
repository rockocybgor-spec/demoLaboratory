import { Component, inject, signal } from '@angular/core';
import { AccesoService } from './acceso.service';

type Boton = 'boton1' | 'boton2' | null;

@Component({
  selector: 'app-acceso',
  standalone: true,
  templateUrl: './acceso.html',
})
export class AccessComponent {
  private accesoService = inject(AccesoService);

  valorSeleccionado = signal<Boton>(null);
  mostrarLogin = signal<boolean>(false);
  usuario = signal<string>('');
  contrasenia = signal<string>('');
  resultado = signal<string | null>(null);
  cargando = signal<boolean>(false);
  error = signal<string | null>(null);

  /** Botón 1 o Botón 2: registran su valor y abren el formulario de login. */
  seleccionarConLogin(boton: Boton): void {
    this.valorSeleccionado.set(boton);
    this.mostrarLogin.set(true);
    this.resultado.set(null);
    this.error.set(null);
  }

  /** Botón 3: valor nulo, sin login, limpia el estado previo y envía de inmediato. */
  seleccionarSinLogin(): void {
    this.valorSeleccionado.set(null);
    this.mostrarLogin.set(false);
    this.usuario.set('');
    this.contrasenia.set('');
    this.resultado.set(null);
    this.error.set(null);

    this.enviarAcceso();
  }

  cancelar(): void {
    this.mostrarLogin.set(false);
    this.valorSeleccionado.set(null);
    this.usuario.set('');
    this.contrasenia.set('');
  }

  /** Punto único donde convergen los tres flujos antes de llamar al backend. */
  enviarAcceso(): void {
    this.cargando.set(true);
    this.error.set(null);

    this.accesoService
      .acceder({
        valor: this.valorSeleccionado(),
        usuario: this.usuario() || null,
        contrasenia: this.contrasenia() || null,
      })
      .subscribe({
        next: (respuesta) => {
          this.resultado.set(respuesta);
          this.cargando.set(false);
        },
        error: (err) => {
          this.error.set('No se pudo acceder. Intenta de nuevo.');
          this.cargando.set(false);
          console.error(err);
        },
      });
  }
}