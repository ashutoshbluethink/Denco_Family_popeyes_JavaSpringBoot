package com.dencofamily.popeyes.punch.controller;

import com.dencofamily.popeyes.punch.model.NewHire;
import com.dencofamily.popeyes.punch.service.NewHireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NewHireController {

    @Autowired
    private NewHireService newHireService;

    @GetMapping("/newhire")
    public String getNewHires(Model model) {
        List<NewHire> newHires = newHireService.getAllNewHires();
        System.out.println(newHires);
        model.addAttribute("newHires", newHires);
        return "newhire";
    }
}
