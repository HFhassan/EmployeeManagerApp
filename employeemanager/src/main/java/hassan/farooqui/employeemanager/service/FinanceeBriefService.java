package hassan.farooqui.employeemanager.service;

import hassan.farooqui.employeemanager.model.FinanceeBrief;
import hassan.farooqui.employeemanager.repo.FinanceeBriefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FinanceeBriefService {

    private final FinanceeBriefRepo financeeBriefRepo;
    @Autowired
    public FinanceeBriefService(FinanceeBriefRepo financeeBriefRepo) {
        this.financeeBriefRepo = financeeBriefRepo;
    }

    public FinanceeBrief addDetail (FinanceeBrief financeeBrief)
    {
        return  financeeBriefRepo.save (financeeBrief);
    }

}
