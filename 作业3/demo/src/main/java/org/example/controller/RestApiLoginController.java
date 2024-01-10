package org.example.controller;
import org.example.dto.UserDataDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("rest")
public class RestApiLoginController {
    @GetMapping(value = "goToLoginString")
    public String toLoginPage() {

        return "login.html";
    }



}
