package com.Doctors.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@RequestMapping("/doctors")
public class Doctors {

    @GetMapping("")
    public String toDoctors()
    {
        return "doctors/doctors";
    }

    @GetMapping("/new_doctor")
    public String toAddDoctor()
    {
        return "doctors/new_doctor";
    }

    @GetMapping("/new_doctor/create")
    public String createDoctor (@RequestParam String firstName,
                                @RequestParam String lastName) {
        System.out.printf ("First Name: %s; Last Name: %s \n", firstName, lastName);
        return "redirect:/doctors";
    }
}