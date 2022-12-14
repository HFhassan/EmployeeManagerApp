import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
//import { error } from 'console';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public employees: any;
  public editEmployee : any;
  public deleteEmployee: any;

  constructor(private employeeService: EmployeeService)
  {}

  ngOnInit()
  {
    this.getEmployees();
  }
  public getEmployees(): void {
    this.employeeService.getEmployees().subscribe(
      (response: Employee[]) => {
        this.employees = response;
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    );
  }

  public onOpenModal (employee: any, mode: string) : void {
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode === 'add')
    {
      button.setAttribute('data-target', '#addEmployeeModal');
    }

    if (mode === 'edit')
    {
      this.editEmployee = employee;
      button.setAttribute('data-target', '#updateEmployeeModal');
    }

    if (mode === 'delete')
    {
      this.deleteEmployee = employee;
      button.setAttribute('data-target', '#deleteEmployeeModal');
    }
    container?.appendChild(button);
    button.click();
  }

  public onAddEmployee(addForm: NgForm):void{

    document.getElementById('add-employee-form')?.click();
    this.employeeService.addEmployee(addForm.value).subscribe(
      (response: Employee) => {
        console.log(response);
        this.getEmployees();
        addForm.reset();
      },
      (errorResponse: HttpErrorResponse) => {
        alert(errorResponse.message);
      }
    )
  }

  public onUpdateEmployee(employee: Employee):void{

    this.employeeService.updateEmployee(employee).subscribe(
      (response: Employee) => {
        console.log(response);
        this.getEmployees();

      },
      (errorResponse: HttpErrorResponse) => {
        alert(errorResponse.message);
      }
    )
  }

  public onDeleteEmployee(employeeId: number):void{

    debugger
    this.employeeService.deleteEmployee(employeeId).subscribe(
      (response: void) => {
        console.log(response);
        this.getEmployees();
      },
      (errorResponse: HttpErrorResponse) => {
        alert(errorResponse.message);
      }
    )
  }

}
