package com.wizard_of_tomorrow.controller.affiliate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tracking")
public class TrackingController {

    @GetMapping
    public String getView() {
        return "pages/tracking/tracking";
    }

}
