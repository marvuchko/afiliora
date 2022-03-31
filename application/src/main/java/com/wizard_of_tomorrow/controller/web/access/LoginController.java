package com.wizard_of_tomorrow.controller.web.access;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import com.wizard_of_tomorrow.controller.web.affiliate.DashboardController;
import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(LoginController.BASE_URL)
public class LoginController extends AbstractViewController {

  public static final String BASE_URL = "/access/login";

  public LoginController() {
    super("pages/login/login");
  }

  @GetMapping
  protected CompletableFuture<ModelAndView> getPage() {
    return toFuture(newModelAndView());
  }

}
