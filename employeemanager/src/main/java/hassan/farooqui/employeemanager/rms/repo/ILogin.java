package hassan.farooqui.employeemanager.rms.repo;

import hassan.farooqui.employeemanager.rms.model.Finance;
import hassan.farooqui.employeemanager.rms.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILogin extends JpaRepository<Login,Long> {
    List<Login> findByUserName(String userName);

}
