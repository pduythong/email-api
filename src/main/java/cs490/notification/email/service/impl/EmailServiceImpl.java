package cs490.notification.email.service.impl;

import cs490.notification.email.dto.EmailContentDto;
import cs490.notification.email.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import javax.mail.internet.InternetAddress;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@Service
public class EmailServiceImpl implements EmailService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender sender;

    private final ScheduledExecutorService quickService = new ScheduledThreadPoolExecutor(20);

    public void sendMail(EmailContentDto emailContentDto) {
        try {
            MimeMessagePreparator message = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

                messageHelper.setFrom(new InternetAddress(emailContentDto.getFrom()));
                messageHelper.setTo(emailContentDto.getTo());
                messageHelper.setSubject(emailContentDto.getSubject());
                messageHelper.setText(emailContentDto.getContent());

            };
            sender.send(message);

        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw ex;
        }

    }

    public void sendASynchronousMail(EmailContentDto emailContentDto) {

        try {
            MimeMessagePreparator message = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

                messageHelper.setFrom(new InternetAddress(emailContentDto.getFrom()));
                messageHelper.setTo(emailContentDto.getTo());
                messageHelper.setSubject(emailContentDto.getSubject());
                messageHelper.setText(emailContentDto.getContent());

            };
            quickService.submit(new Runnable() {
                @Override
                public void run() {
                    sender.send(message);
                }
            });


        } catch (Exception ex) {
            logger.error(ex.getMessage());
//            throw ex;
        }
    }
}


