package cs490.notification.email.service;

import cs490.notification.email.dto.OrderDto;

public interface UserService {
    void sendOrderEmail(OrderDto orderDto);
}
