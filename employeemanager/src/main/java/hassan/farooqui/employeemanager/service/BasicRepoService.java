package hassan.farooqui.employeemanager.service;

import hassan.farooqui.employeemanager.model.BasicReport;
import hassan.farooqui.employeemanager.model.Employee;
import hassan.farooqui.employeemanager.repo.BasicRepostRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class BasicRepoService {
    private final BasicRepostRepo basicRepostRepo;

    public BasicRepoService(BasicRepostRepo basicRepostRepo) {
        this.basicRepostRepo = basicRepostRepo;
    }

    public BasicReport addBasicReport (BasicReport basicReport)
    {
        return  basicRepostRepo.save(basicReport);
    }

    public List<BasicReport> findAllBasicreport()
    {
        return basicRepostRepo.findAll();
    }

}
