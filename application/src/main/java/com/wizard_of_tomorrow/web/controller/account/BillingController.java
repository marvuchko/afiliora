package com.wizard_of_tomorrow.web.controller.account;

import com.wizard_of_tomorrow.controller.AbstractViewController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(BillingController.BASE_URL)
public class BillingController extends AbstractViewController {

    public static final String BASE_URL = "/billing";

    public BillingController() {
        super("pages/billing/billing");
    }

    @Override
    @GetMapping
    public String getView() {
        return super.getView();
    }

}
