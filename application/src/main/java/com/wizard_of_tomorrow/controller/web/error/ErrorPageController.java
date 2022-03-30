package com.wizard_of_tomorrow.controller.web.error;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(ErrorPageController.BASE_URL)
public class ErrorPageController extends AbstractViewController implements ErrorController {

  public static final String BASE_URL = "/error";
  public static final String ERROR_STATUS_CODE = "javax.servlet.error.status_code";

  public ErrorPageController() {
    super("pages/error/error");
  }

  @GetMapping
  public CompletableFuture<String> getView(HttpServletRequest request, ModelMap model) {
    var errorCode = getErrorCode(request);
    model.addAttribute("errorCode", errorCode);
    return super.getView();
  }

  private Integer getErrorCode(HttpServletRequest httpRequest) {
    var code = httpRequest.getAttribute(ERROR_STATUS_CODE);
    return (Integer) Optional.ofNullable(code).orElse(HttpStatus.INTERNAL_SERVER_ERROR.value());
  }

}
