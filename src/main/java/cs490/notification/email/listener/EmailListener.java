package cs490.notification.email.listener;

import cs490.notification.email.dto.EmailContentDto;
import cs490.notification.email.service.EmailService;
import lombok.RequiredArgsConstructor;

//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmailListener {

    private final Logger logger = LoggerFactory.getLogger(EmailListener.class);
    private EmailService emailService;

    @Autowired
    public EmailListener(EmailService emailService) {
        this.emailService = emailService;
    }

//    @KafkaListener(groupId = "order",topics = "test")
//    public void listenOrderEmail( DTO dto) {
//
//      logger.info(dto.toString());
//      System.out.println(dto);
//
//    }

//    @KafkaListener(groupId = "order", topics = "OrderCreated")
//    @KafkaListener(groupId = "order", topics = "Test")
//    public void listenEmail(OrderDto dto) {
//        logger.info(dto.toString());
//        vendorService.sendOrderEmail(dto);
//
//    }


    @KafkaListener(groupId = "order", topics = "Test")
    public void listenEmailOrder(List<EmailContentDto> dtos) {
        logger.info(dtos.toString());
//        userService.sendOrderEmail(dto);
//        vendorService.sendOrderEmail(dtos);
        emailService.sendASynchronousMail(dtos);

    }

    @KafkaListener(groupId = "order", topics = "Order-Succeed")
    public void listenOrderEmail(List<EmailContentDto> dtos) {
        logger.info(dtos.toString());
//        userService.sendOrderEmail(dto);
        emailService.sendASynchronousMail(dtos);

    }





}
