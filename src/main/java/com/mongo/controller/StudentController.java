package com.mongo.controller;

import com.mongo.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by singhnk on 27-09-2016.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/home")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

}
