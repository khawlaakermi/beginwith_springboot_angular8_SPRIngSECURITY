import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StaffService {

  private baseUrl = 'http://localhost:8181/staff';
  constructor(private http: HttpClient) { }

  getStaffsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  createStaff(staff: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, staff);
  }
  deleteStaff(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
  getStaff(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
}
