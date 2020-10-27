package cs490.notification.email.service.impl;

import cs490.notification.email.dto.EmailContentDto;
import cs490.notification.email.dto.OrderDto;
import cs490.notification.email.service.EmailService;
import cs490.notification.email.service.VendorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VendorServiceImpl implements VendorService {
    EmailService emailService;

    public void sendMail(EmailContentDto emailContentDto) {

        emailService.sendMail(emailContentDto);

    }

    @Override
    public void sendOrderEmail(OrderDto orderDto) {
//
//        Optional<Order> orderOptional = orderRepository.findById(orderDto.getOrderId());
//
//        if (orderOptional.isPresent()) {
//            Order order = orderOptional.get();
//
//            List<OrderItem> items = order.getItems();
//            ConcurrentHashMap<String,List<Product>> vendors  = new ConcurrentHashMap<>();
//
//            for (OrderItem item : items) {
//                vendors.getOrDefault(item.getProduct().getVendor().getEmail(), new ArrayList<>()).add(item.getProduct());
//
//            }


//            items.stream().collect(Collectors.groupingBy(i->i.getProduct().getVendor()));

//            Set<User> vendorsSet;
//            vendorsSet = itemList.stream().map(OrderItem::getProduct).map(Product::getVendor).distinct().collect(Collectors.toSet());

//        }

    }
}
