package com.wizard_of_tomorrow.controller.web.error;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorPageController extends AbstractViewController implements ErrorController {

  public static final String BASE_URL = "/error";

  public ErrorPageController() {
    super("pages/error/error");
  }

  @RequestMapping(ErrorPageController.BASE_URL)
  public ModelAndView getPage() {
    var errorCode = getErrorStatus().value();
    var modelAndView = newModelAndView();
    modelAndView.addObject("errorCode", errorCode);
    return modelAndView;
  }

}
