import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface AccederRequest {
  valor: string | null;
  usuario: string | null;
  contrasenia: string | null;
}

@Injectable({
  providedIn: 'root',
})
export class AccesoService {
  private http = inject(HttpClient);
  private readonly baseUrl = 'http://192.168.1.190:8080/demo/acceder';

  acceder(request: AccederRequest): Observable<string> {
    return this.http.post<string>(this.baseUrl, request, { responseType: 'text' });
  }
}