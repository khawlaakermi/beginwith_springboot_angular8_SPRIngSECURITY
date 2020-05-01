import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class JoueurService {
  private baseUrl = 'http://localhost:8181/joueur';
  constructor(private http: HttpClient) { }

  getJoueursList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  createJoueur(joueur: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, joueur);
  }
  deleteJoueur(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
  getJoueur(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
}
