package hassan.farooqui.employeemanager.repo;

import hassan.farooqui.employeemanager.model.BasicReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicRepostRepo extends JpaRepository<BasicReport,Long> {
}
