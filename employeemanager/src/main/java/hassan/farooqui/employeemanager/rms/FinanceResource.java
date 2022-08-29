package hassan.farooqui.employeemanager.rms;
import hassan.farooqui.employeemanager.model.BasicReport;
import hassan.farooqui.employeemanager.rms.model.Finance;
import hassan.farooqui.employeemanager.rms.service.FinanceRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/financereport")
public class FinanceResource {
    private final FinanceRepo financeRepo;

    public FinanceResource(FinanceRepo financeRepo) {
        this.financeRepo = financeRepo;
    }

    @PostMapping("/add")
    public ResponseEntity<Finance> addBasicReport (@RequestBody Finance finance)
    {
        Finance newFinance = financeRepo.addFinancedetail(finance);
        return  new ResponseEntity<>(newFinance, HttpStatus.CREATED);
    }

    @GetMapping("/find/{cmId}")
    public ResponseEntity<List<Finance>> getBasicReportByCmId (@PathVariable("cmId") String cmId)
    {
        List <Finance> finance =  financeRepo.findFinanceReportByCmId(cmId);
        return new ResponseEntity<>(finance, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Finance>> getAllFinance()
    {
        List <Finance> financeReport = financeRepo.findAllFinanceDetail();
        return new ResponseEntity<>(financeReport, HttpStatus.OK);
    }
}
