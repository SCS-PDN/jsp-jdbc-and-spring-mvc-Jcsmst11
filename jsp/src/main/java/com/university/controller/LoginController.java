package com.university.controller;

import javax.servlet.http.HttpSession;
import com.university.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {
        if ("s10123.sci.pdn.ac.lk".equals(email) && "pass1".equals(password)) {
            session.setAttribute("student", new Student(email));
            return "redirect:/courses";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
}