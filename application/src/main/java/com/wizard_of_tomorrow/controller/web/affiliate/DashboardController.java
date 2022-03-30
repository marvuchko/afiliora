package com.wizard_of_tomorrow.controller.web.affiliate;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(DashboardController.BASE_URL)
public class DashboardController extends AbstractViewController {

  public static final String BASE_URL = "/dashboard";

  public DashboardController() {
    super("pages/dashboard/dashboard");
  }

  @GetMapping
  protected CompletableFuture<ModelAndView> getPage() {
    return modelAndViewFuture();
  }

}
