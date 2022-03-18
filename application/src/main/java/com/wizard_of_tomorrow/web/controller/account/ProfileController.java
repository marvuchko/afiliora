package com.wizard_of_tomorrow.web.controller.account;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(ProfileController.BASE_URL)
public class ProfileController extends AbstractViewController {

    public static final String BASE_URL = "/profile";

    public ProfileController() {
        super( "pages/profile/profile");
    }

    @Override
    @GetMapping
    public String getView() {
        return super.getView();
    }

}
