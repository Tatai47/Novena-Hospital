package com.doctor.appoinment.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctor.appoinment.Entities.Appointments;
import com.doctor.appoinment.Entities.ContactUs;
import com.doctor.appoinment.Entities.Subscribe;
import com.doctor.appoinment.Services.AppointmentService;
import com.doctor.appoinment.Services.ContactUsService;
import com.doctor.appoinment.Services.SubscribeService;

@Controller
@RequestMapping("doctor-appointment")
public class MainController {

    @Autowired
    AppointmentService appointmentService;
    @Autowired
    ContactUsService contactUsService;
    @Autowired
    SubscribeService subscribeService;

    // @ResponseBody
    @GetMapping("/")
    public String index1() {
        return "index";
    }

    // @ResponseBody
    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("about")
    public String about() {
        return "about";
    }

    @GetMapping("appoinment")
    public String appoinment() {
        return "appoinment";
    }

    @GetMapping("blog-sidebar")
    public String blogSidebar() {
        return "blog-sidebar";
    }

    @GetMapping("blog-single")
    public String blogSingle() {
        return "blog-single";
    }

    @GetMapping("confirmation")
    public String confirmation() {
        return "confirmation";
    }

    @GetMapping("contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("department")
    public String department() {
        return "department";
    }

    @GetMapping("department-single")
    public String department_single() {
        return "department-single";
    }

    @GetMapping("doctor-single")
    public String doctorSingle() {
        return "doctor-single";
    }

    @GetMapping("doctor")
    public String doctors() {
        return "doctor";
    }

    @GetMapping("service")
    public String service() {
        return "service";
    }

    @GetMapping("mail")
    public String mail() {
        return "service";
    }

    @PostMapping("subscribe")
    public String subscribe(@RequestParam("email") String email) {
        Subscribe subscribe = new Subscribe();
        subscribe.setEmail(email);
        subscribe.setStatus("subscribed");
        System.out.println("Subscribed with email: " + email);
        if (subscribeService.saveSubscribe(subscribe)) {
            return "index";
        } else {
            return "error";
        }
    }

    @PostMapping("confirmation")
    public String BookAppointment(Model model,
            @RequestParam("department") String department,
            @RequestParam("doctors") String doctor,
            @RequestParam("date") String date,
            @RequestParam("time") String time,
            @RequestParam("name") String name,
            @RequestParam("phone") String phone,
            @RequestParam("message") String message) {
        Appointments appointments = new Appointments();
        appointments.setDepartment(department);
        appointments.setDoctor(doctor);
        appointments.setDate(date);
        appointments.setTime(time);
        appointments.setName(name);
        appointments.setPhone(phone);
        appointments.setMessage(message);
        model.addAttribute("name", name);
        System.out.println(appointments);
        if (appointmentService.saveAppointment(appointments)) {
            return "appointment-confirmation";
        } else {
            return "error";
        }
    }

    @PostMapping("contact-us")
    public String contactUs(Model model,
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("subject") String subject,
            @RequestParam("phone") String phone,
            @RequestParam("message") String message) {
        ContactUs contactUs = new ContactUs();
        contactUs.setName(name);
        contactUs.setEmail(email);
        contactUs.setQuery(subject);
        contactUs.setPhone(phone);
        contactUs.setMessage(message);
        if (contactUsService.ContactUs(contactUs)) {
            model.addAttribute("name", name);
            return "contact-confirmation";
        } else {
            return "error";
        }
    }

}
// No code changes required. Fix your project classpath and dependencies in your
// IDE or build tool.
