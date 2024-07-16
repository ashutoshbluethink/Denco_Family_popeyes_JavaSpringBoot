package com.dencofamily.popeyes.punch.controller;

import com.dencofamily.popeyes.punch.service.PunchImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PunchController {

    @Autowired
    private PunchImporter punchImporter;

    @GetMapping("/punch")
    public String hello(Model model) {
        model.addAttribute("message", punchImporter.getHelloMessage());
        return "punch"; // Ensure this corresponds to dcstores.html in the templates folder
    }
}