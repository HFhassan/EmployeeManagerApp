package hassan.farooqui.employeemanager;

import hassan.farooqui.employeemanager.model.BasicReport;
import hassan.farooqui.employeemanager.model.Employee;
import hassan.farooqui.employeemanager.service.BasicRepoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basicreport")
public class BasicReportResource {

    private final BasicRepoService basicRepoService;

    public BasicReportResource(BasicRepoService basicRepoService) {
        this.basicRepoService = basicRepoService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<BasicReport>> getAllBasicReport()
    {
        List <BasicReport> basicreport = basicRepoService.findAllBasicreport();
        return new ResponseEntity<>(basicreport, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<BasicReport> addBasicReport (@RequestBody BasicReport basicReport)
    {
        BasicReport newBasicReport = basicRepoService.addBasicReport(basicReport);
        return  new ResponseEntity<>(newBasicReport, HttpStatus.CREATED);
    }

    @GetMapping("/find/{cmId}")
    public ResponseEntity<List<BasicReport>> getBasicReportByCmId (@PathVariable("cmId") String cmId)
    {
        List <BasicReport> basicreport =  basicRepoService.findBasicReportByCmId(cmId);
        return new ResponseEntity<>(basicreport, HttpStatus.OK);
    }
}
