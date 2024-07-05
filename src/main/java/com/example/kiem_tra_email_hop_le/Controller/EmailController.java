package com.example.kiem_tra_email_hop_le.Controller;

import com.example.kiem_tra_email_hop_le.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public String home() {
        return "Home"; // Giả sử bạn có một template home.html
    }

    @PostMapping("/CheckEmail")
    public String checkEmail(@RequestParam String email, ModelMap modelMap) {
        if (emailService.CheckEmail(email)) {
            modelMap.addAttribute("message", "Email hợp lệ");
        } else {
            modelMap.addAttribute("message", "Email không hợp lệ");
        }
        return "Home"; // Trả về trang home.html với thông báo
    }
}
