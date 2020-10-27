package cs490.notification.email.service;

import cs490.notification.email.dto.EmailContentDto;

public interface EmailService {

    void sendMail(EmailContentDto emailContentDto);

    void sendASynchronousMail(EmailContentDto emailContentDto);
}
