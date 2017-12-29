package com.example.demo.controller;


import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class adminController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        System.out.println("-----------index-------------");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Fahad", 22, "IT-13021"));
        studentList.add(new Student("Ocean", 20, "IT-13022"));
        studentList.add(new Student("farukh", 39, "IT-13047"));


        model.addAttribute("studentList", studentList);
        model.addAttribute("myMessage", "Hey we have run it successfully.....");


        return "index";
    }

    @RequestMapping(value = "/upsertStudent", method = RequestMethod.GET)
    public String studentView(Model model) {
        System.out.println("-----------show defult value in front end -------------");
        //Student student = new Student("Fahad", 212, "IT-10001");
        Student student = new Student();
        model.addAttribute("student", student);
        return "student";
    }

    @RequestMapping(value = "/upsertStudent", method = RequestMethod.POST)
    public String studentPost(Model model, @ModelAttribute("student") Student student) {
        System.out.println("-----------data from front end------------");
        System.out.println(student);
        return "redirect:./";
    }
}
