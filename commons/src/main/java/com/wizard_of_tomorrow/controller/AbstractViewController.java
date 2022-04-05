package com.wizard_of_tomorrow.controller;

import static java.util.concurrent.CompletableFuture.completedFuture;

import java.util.concurrent.CompletableFuture;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class AbstractViewController extends BaseController {

  final String view;

  protected ModelAndView redirectTo(String url) {
    return newModelAndView("redirect:%s".formatted(url));
  }

  protected CompletableFuture<ModelAndView> toFuture(ModelAndView modelAndView) {
    return completedFuture(modelAndView);
  }

  protected ModelAndView newModelAndView() {
    return newModelAndView(view);
  }

  protected ModelAndView newModelAndView(String viewName) {
    return new ModelAndView(viewName);
  }

}
