package com.dencofamily.popeyes.punch.controller;

import com.dencofamily.popeyes.punch.model.Dcstore;
import com.dencofamily.popeyes.punch.service.DcstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DcstoreController {

    @Autowired
    private DcstoreService dcstoreService;

    @GetMapping("/dcstores")
    public String getDcstores(Model model) {
        List<Dcstore> dcstores = dcstoreService.getAllStores();
//        System.out.println("Fetched DC Stores: " + dcstores);
//        for (Dcstore dcstore : dcstores) {
//            System.out.println(dcstore);
//        }
        model.addAttribute("dcstores", dcstores);
        return "dcstores";
    }
}
