/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pair.controllers;

import com.example.pair.model.User;
import com.example.pair.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService us;

	@GetMapping
	public String getAllUser(Model model) {
		model.addAttribute("users", us.getAllUsers());
		return "index";
	}

	@GetMapping("/create")
	public String showFormUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "create_user";
	}

	@PostMapping("/create")
	public String saveUser(@ModelAttribute("user") User user) {
		if (user.getId() == 0)
			us.saveUser(user);
		return "redirect/";
	}

	@GetMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id, Model model) {
		User user = us.getOneUser(id);
		model.addAttribute("user", user);
		return "update_user";
	}

	@PostMapping("/update/{id}")
	public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") int id) {
		user.setId(id);
		us.saveUser(user);
		return "redirect:/";
	}

}
