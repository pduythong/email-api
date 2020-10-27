package cs490.notification.email.listener;

import cs490.notification.email.dto.EmailContentDto;
import cs490.notification.email.dto.OrderDto;
import cs490.notification.email.service.UserService;
import cs490.notification.email.service.VendorService;
import lombok.RequiredArgsConstructor;

//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailListener {

    private final Logger logger = LoggerFactory.getLogger(EmailListener.class);
    private UserService userService;
    private VendorService vendorService;

    @Autowired
    public EmailListener(UserService userService, VendorService vendorService) {
        this.userService = userService;
        this.vendorService = vendorService;
    }

//    @KafkaListener(groupId = "order",topics = "test")
//    public void listenOrderEmail( DTO dto) {
//
//      logger.info(dto.toString());
//      System.out.println(dto);
//
//    }

    @KafkaListener(groupId = "order", topics = "order-created")
    public void listenOrderEmail(OrderDto dto) {
        logger.info(dto.toString());
        userService.sendOrderEmail(dto);
        vendorService.sendOrderEmail(dto);
    }

}
