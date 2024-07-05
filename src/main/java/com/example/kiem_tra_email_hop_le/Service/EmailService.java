package com.example.kiem_tra_email_hop_le.Service;

import org.springframework.stereotype.Service;

@Service


public class EmailService {
    public Boolean CheckEmail( String email){
        // Biểu thức chính quy để kiểm tra định dạng email
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
}
