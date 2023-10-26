package com.Doctors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotations.*;

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
        System.out.printf ("")
    }
    {
        return "doctors/doctors";
    }
}