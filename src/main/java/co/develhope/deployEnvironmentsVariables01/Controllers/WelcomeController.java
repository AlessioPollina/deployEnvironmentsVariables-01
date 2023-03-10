package co.develhope.deployEnvironmentsVariables01.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    private Environment environment;

    @GetMapping("")
    public String getProperty(){
        return "Welcome dev " + environment.getProperty("devName") + " with authCode " + environment.getProperty("authCode");
    }
}
