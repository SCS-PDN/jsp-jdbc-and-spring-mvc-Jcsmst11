package com.university.controller;

import com.university.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class CourseController {

    List<Course> courseList = Arrays.asList(
        new Course("csc2112", "Data Structure", "Dr. Smith", 3),
        new Course("PHY3014", "Physics", "Dr. Ray", 4)
    );

    @GetMapping("/courses")
    public String showCourses(Model model) {
        model.addAttribute("courses", courseList);
        return "courses";
    }

    @PostMapping("/register/{courseId}")
    public String registerCourse(@PathVariable int courseId, HttpSession session) {
        session.setAttribute("registeredCourse", courseId);
        return "success";
    }
}