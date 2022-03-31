package com.wizard_of_tomorrow.controller.web.account;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(ProfileController.BASE_URL)
public class ProfileController extends AbstractViewController {

  public static final String BASE_URL = "/profile";

  public ProfileController() {
    super("pages/profile/profile");
  }

  @GetMapping
  protected CompletableFuture<ModelAndView> getPage() {
    return toFuture(newModelAndView());
  }

}
