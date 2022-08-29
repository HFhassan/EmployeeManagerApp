package hassan.farooqui.employeemanager.repo;

import hassan.farooqui.employeemanager.model.BasicReport;
import hassan.farooqui.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BasicRepostRepo extends JpaRepository<BasicReport,Long> {
    //@Query("Select * from basic_report where cmId = ?")
    List<BasicReport> findBasicReportByCmId(String cmId);

}
