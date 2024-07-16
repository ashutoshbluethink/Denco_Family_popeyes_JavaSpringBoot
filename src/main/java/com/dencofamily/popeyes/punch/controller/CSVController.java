package com.dencofamily.popeyes.punch.controller;

import com.dencofamily.popeyes.punch.model.PunchRecord;
import com.dencofamily.popeyes.punch.service.CSVService;
import com.dencofamily.popeyes.punch.service.PunchRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class CSVController {

    @Autowired
    private CSVService csvService;

    @Autowired
    private PunchRecordService punchRecordService;

    @GetMapping("/upload-form")
    public String showUploadForm(Model model) {
        List<PunchRecord> punchRecords = punchRecordService.getAllPunchRecords();
        model.addAttribute("punchRecords", punchRecords);
        return "upload";
    }

    @PostMapping("/upload-csv")
    public String uploadCSV(@RequestParam("file") MultipartFile file, Model model) {
        try {
            csvService.processCSV(file);
            model.addAttribute("message", "File uploaded successfully");
        } catch (Exception e) {
            model.addAttribute("message", "Failed to upload file: " + e.getMessage());
        }
        List<PunchRecord> punchRecords = punchRecordService.getAllPunchRecords();
        model.addAttribute("punchRecords", punchRecords);
        return "upload";
    }
}
