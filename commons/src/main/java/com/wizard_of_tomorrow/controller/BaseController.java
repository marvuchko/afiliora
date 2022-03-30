package com.wizard_of_tomorrow.controller;

import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static org.springframework.web.context.request.RequestContextHolder.getRequestAttributes;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.ServletRequestAttributes;

public abstract class BaseController {

  protected HttpServletRequest getRequest() {
    return requireNonNull((ServletRequestAttributes) getRequestAttributes()).getRequest();
  }

  protected HttpStatus getErrorStatus() {
    var request = getRequest();
    var code = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    return ofNullable((Integer) code)
        .map(HttpStatus::valueOf)
        .orElse(HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
