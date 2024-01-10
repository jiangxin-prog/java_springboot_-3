package org.example.controller;
import org.example.dto.UserDataDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
//    @GetMapping(value = "goToLoginPage")
//    public String toLoginPage(Model model) {
//        System.out.println("11112222223333");
//        List<String> usernames = new ArrayList<>();
//        usernames.add("LiSa");
//        usernames.add("Joey");
//        usernames.add("Sam");
//        model.addAttribute("usernames", usernames);
//        model.addAttribute("pageTitle", "LoginPage");
//        return "login.html";
//    }
//
//    @PostMapping(value = "login")
//    public String toLoginPage(@ModelAttribute UserDataDTO user) {
//        System.out.println(user.getUsername());
//        System.out.println(user.getPassword());
//        return "login.html";
//    }

}
