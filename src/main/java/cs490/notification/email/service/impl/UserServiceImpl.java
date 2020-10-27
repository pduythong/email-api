package cs490.notification.email.service.impl;

import cs490.notification.email.dto.EmailContentDto;
import cs490.notification.email.dto.OrderDto;
import cs490.notification.email.service.EmailService;
import cs490.notification.email.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    EmailService emailService;

    public void sendOrderEmail(OrderDto orderDto) {



    }

    public void sendMail(EmailContentDto emailContentDto) {

        emailService.sendMail(emailContentDto);

    }
}
