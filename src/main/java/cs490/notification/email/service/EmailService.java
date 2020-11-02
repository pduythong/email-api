package cs490.notification.email.service;

import cs490.notification.email.dto.EmailContentDto;

import java.util.List;

public interface EmailService {

    void sendMail(EmailContentDto emailContentDto);

    void sendASynchronousMail(EmailContentDto emailContentDto);

    void sendMail(List<EmailContentDto> emailContentDto);

    void sendASynchronousMail(List<EmailContentDto> emailContentDto);
}
