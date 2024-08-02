import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  employee: Employee = new Employee();
  result: string = '';
  employeeArr: Employee[] = [];

  constructor(private service: EmployeeService) {}
  insert(data: any) {
    this.employee.id = +data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = +data.empSalary;

    this.service.addEmployee(this.employee).then(() => {
      this.result = `Employee ${this.employee.empName} Details Added`;
      this.loadEmployees();
    }).catch(() => {
      this.result = 'Error adding employee';
    });
  }
  loadEmployees() {
    this.service.getEmployees().then(data => {
      this.employeeArr = data;
    }).catch(() => {
      this.result = 'Error loading employees';
    });
  }
}
