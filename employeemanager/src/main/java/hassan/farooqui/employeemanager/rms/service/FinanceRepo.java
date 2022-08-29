package hassan.farooqui.employeemanager.rms.service;

import hassan.farooqui.employeemanager.rms.model.Finance;
import org.springframework.stereotype.Service;
import hassan.farooqui.employeemanager.rms.repo.IFinance;

import java.util.List;

@Service

public class FinanceRepo {
    private final IFinance iFinance;

    public FinanceRepo(IFinance iFinance) {
        this.iFinance = iFinance;
    }

    public Finance addFinancedetail (Finance finance)
    {
        return  iFinance.save(finance);
    }

    public List<Finance> findAllFinanceDetail()
    {
        return iFinance.findAll();
    }

    public List <Finance> findFinanceReportByCmId(String cmId)
    {
        return iFinance.findByCmId(cmId);
    }

}
