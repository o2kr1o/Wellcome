package com.example.wellcome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.wellcome.model.ContactForm;
import com.example.wellcome.service.ContactService;

@Controller
public class ContactController {
    @Autowired
    ContactService cService;

    @GetMapping("/top")
    public String display() {
        return "index";
    }
    @PostMapping("/top")
    public String submit(ContactForm contactForm, Model model) {
        model.addAttribute("contactForm", contactForm);
        cService.save(contactForm);
        return "redirect:/top";
    }
}
