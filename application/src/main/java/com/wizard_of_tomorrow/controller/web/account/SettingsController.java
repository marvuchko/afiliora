package com.wizard_of_tomorrow.controller.web.account;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(SettingsController.BASE_URL)
public class SettingsController extends AbstractViewController {

  public static final String BASE_URL = "/settings";

  public SettingsController() {
    super("pages/settings/settings");
  }

  @Override
  @GetMapping
  public String getView() {
    return super.getView();
  }

}
