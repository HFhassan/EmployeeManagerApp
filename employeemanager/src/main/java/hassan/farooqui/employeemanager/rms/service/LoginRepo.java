package hassan.farooqui.employeemanager.rms.service;

import hassan.farooqui.employeemanager.rms.model.Finance;
import hassan.farooqui.employeemanager.rms.model.Login;
import hassan.farooqui.employeemanager.rms.repo.ILogin;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class LoginRepo {
    private final ILogin iLogin;

    public LoginRepo(ILogin iLogin) {
        this.iLogin = iLogin;
    }
    public List<Login> findByUserName(String userName)
    {
        return iLogin.findByUserName(userName);
    }

}
