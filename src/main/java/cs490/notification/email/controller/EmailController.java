package cs490.notification.email.controller;

import cs490.notification.email.dto.EmailContentDto;
import cs490.notification.email.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmailController {
    EmailService emailService;

    @PostMapping("/sendMail")
    public void sendEmail(@RequestBody List<EmailContentDto> dtos){
        emailService.sendASynchronousMail(dtos);
    }

}
