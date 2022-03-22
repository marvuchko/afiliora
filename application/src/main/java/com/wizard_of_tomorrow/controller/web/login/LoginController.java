package com.wizard_of_tomorrow.controller.web.login;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(LoginController.BASE_URL)
public class LoginController extends AbstractViewController {

    public static final String BASE_URL = "/login";

    public LoginController() {
        super("pages/login/login");
    }

    @Override
    @GetMapping
    public String getView() {
        return super.getView();
    }
}
