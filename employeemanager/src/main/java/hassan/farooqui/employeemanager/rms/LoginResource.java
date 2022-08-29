package hassan.farooqui.employeemanager.rms;
import hassan.farooqui.employeemanager.rms.model.Finance;
import hassan.farooqui.employeemanager.rms.model.Login;
import hassan.farooqui.employeemanager.rms.service.LoginRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginResource {
    private final LoginRepo loginRepo;

    public LoginResource(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
    }

    @GetMapping("/find/{userName}")
    public ResponseEntity<List<Login>> getByUserName (@PathVariable("userName") String userName)
    {
        List <Login> login =  loginRepo.findByUserName(userName);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }
}
