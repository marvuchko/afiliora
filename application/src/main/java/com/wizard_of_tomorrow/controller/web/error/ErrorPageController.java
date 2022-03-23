package com.wizard_of_tomorrow.controller.web.error;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
@RequestMapping(ErrorPageController.BASE_URL)
public class ErrorPageController extends AbstractViewController implements ErrorController {

    public static final String BASE_URL = "/error";

    public ErrorPageController() {
        super("pages/error/error");
    }

    @GetMapping
    public String getView(HttpServletRequest request, ModelMap model) {
        var errorCode = getErrorCode(request);
        model.addAttribute("errorCode", errorCode);
        return super.getView();
    }

    private Integer getErrorCode(HttpServletRequest httpRequest) {
        var code = httpRequest.getAttribute("javax.servlet.error.status_code");
        return (Integer) Optional.ofNullable(code).orElse(500);
    }

}
