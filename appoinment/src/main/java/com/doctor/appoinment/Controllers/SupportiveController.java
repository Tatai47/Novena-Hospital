package com.doctor.appoinment.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupportiveController {

    @GetMapping("")
    public String index() {
        return "redirect:/doctor-appointment/index";
    }

    @GetMapping("index")
    public String index1() {
        return "redirect:/doctor-appointment/index";
    }
}
