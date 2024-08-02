import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private url = 'http://localhost:3004/employees';
  constructor(private http: HttpClient) {}
  addEmployee(employee: Employee): Promise<void> {
    return this.http.post<void>(this.url, employee).toPromise();
  }
  getEmployees(): Promise<Employee[]> {
    return this.http.get<Employee[]>(this.url).toPromise()
      .then(data => data || []);
  }
}
