package com.example.routeCheck.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class LoginController {

//    private final ResourceLoader resourceLoader;
//
//    public LoginController(ResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    @PostMapping("/login")
//    public String processLogin(
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            Model model) {
//
//        // Perform authentication logic here (e.g., checking credentials against a database)
//        boolean isAuthenticated = authenticate(username, password);
//
//        if (isAuthenticated) {
//            // Redirect to the home page or another authenticated page
//            return "redirect:/home";
//        } else {
//            model.addAttribute("error", "Invalid username or password");
//            return "login"; // Return to the login form with an error message
//        }
//    }

}
