import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EquipeService {
  private baseUrl = 'http://localhost:8181/equipe';
  constructor(private http: HttpClient) { }
  getEquipesList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  createEquipe(equipe: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, equipe);
  }
  deleteEquipe(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
  getEquipe(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
  getJoueurs(id:number):Observable<any>{
    return this.http.get(`${this.baseUrl}/joueurs/${id}`);
  }
  
}
