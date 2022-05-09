/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example2.controllers;

import com.example2.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*
@Controller
@RequestMapping("/login")
public class LoginController {
    
     
    @GetMapping("")
    public String showLogin(Model model) {
        User user = new User();
        model.addAttribute("user",user);
        return "/login";
    }
            
    @PostMapping("")
    public String login(@ModelAttribute("user") User user){
        return "redirect:/person/all";
    }
}*/
