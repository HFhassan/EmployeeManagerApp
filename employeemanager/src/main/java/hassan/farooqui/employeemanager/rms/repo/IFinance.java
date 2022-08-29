package hassan.farooqui.employeemanager.rms.repo;

import hassan.farooqui.employeemanager.rms.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFinance extends JpaRepository<Finance,Long> {
    List<Finance> findByCmId(String cmId);

}
