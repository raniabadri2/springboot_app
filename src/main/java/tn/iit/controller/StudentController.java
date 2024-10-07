package tn.iit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping({"/", "/all"})
    public String findAll() {
        return "students";
    }

    @PostMapping("/save")
    public String save(@RequestParam("id") int id,
                       @RequestParam("firstname") String firstname,
                       @RequestParam("lastname") String lastname) {
        return "students";
    }
}
