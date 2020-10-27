package cs490.notification.email.service;

import cs490.notification.email.dto.OrderDto;

public interface VendorService {
    void sendOrderEmail(OrderDto orderDto);
}
