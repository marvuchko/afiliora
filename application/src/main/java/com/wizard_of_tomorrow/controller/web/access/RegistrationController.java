package com.wizard_of_tomorrow.controller.web.access;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(RegistrationController.BASE_URL)
public class RegistrationController extends AbstractViewController {

  public static final String BASE_URL = "/access/register";

  public RegistrationController() {
    super("pages/register/register");
  }

  @Override
  @GetMapping
  public CompletableFuture<String> getView() {
    return super.getView();
  }

}
