package com.demoproject.games.controllers;

import com.demoproject.games.models.Report;
import com.demoproject.games.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  Ahmed Salem
 */

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    ReportService reportService;


    @GetMapping
    public Report generateReport(){
        return reportService.generateReport();
    }

}
