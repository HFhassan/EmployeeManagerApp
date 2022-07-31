import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import { environment } from '../environments/environment';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private apiServerurl = environment.apiBaseUrl ;
  constructor(private http: HttpClient) { }
  public getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.apiServerurl}/employee/all`);
  }
  public addEmployee(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(`${this.apiServerurl}/employee/add`,employee);
  }

  public updateEmployee(employee: Employee): Observable<Employee> {
    return this.http.put<Employee>(`${this.apiServerurl}/employee/update`,employee);
  }
  public deleteEmployee(employeeId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerurl}/employee/delete/${employeeId}`);
  }
}
