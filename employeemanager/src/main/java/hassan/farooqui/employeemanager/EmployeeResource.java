package hassan.farooqui.employeemanager;

import hassan.farooqui.employeemanager.model.Employee;
import hassan.farooqui.employeemanager.model.FinanceeBrief;
import hassan.farooqui.employeemanager.repo.FinanceeBriefRepo;
import hassan.farooqui.employeemanager.service.EmployeeService;
import hassan.farooqui.employeemanager.service.FinanceeBriefService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    private final EmployeeService employeeService;
    private final FinanceeBriefService financeeBriefService;
    public EmployeeResource(EmployeeService employeeService, FinanceeBriefService financeeBriefService) {
        this.employeeService = employeeService;
        this.financeeBriefService = financeeBriefService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees()
    {
        List <Employee> employees = employeeService.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id)
    {
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
            public ResponseEntity<Employee> addEmployee (@RequestBody Employee employee)
    {
        Employee newEmployee = employeeService.addEmployee(employee);
        return  new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
    @PostMapping("/adda")
    public ResponseEntity<FinanceeBrief> addFinancee (@RequestBody FinanceeBrief financeeBrief)
    {
        FinanceeBrief financeeBrief1 =  financeeBriefService.addDetail(financeeBrief);
        return  new ResponseEntity<>(financeeBrief1, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee (@RequestBody Employee employee)
    {
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return  new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee (@PathVariable("id") Long id)
    {
        employeeService.deleteEmployeeById(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
