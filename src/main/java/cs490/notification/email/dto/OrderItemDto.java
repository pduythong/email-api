package cs490.notification.email.dto;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class OrderItemDto {
    Long productId;
    Long vendorId;
    String productName;
    double unitPrice;
    int quantity;
}
