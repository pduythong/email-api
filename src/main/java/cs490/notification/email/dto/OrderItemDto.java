package cs490.notification.email.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderItemDto {
    Long orderId;
    Long productId;
    Long vendorId;
    String productName;
    String userEmail;
    double unitPrice;
    int quantity;
}
