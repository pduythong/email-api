package cs490.notification.email.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class OrderDto {
    Long orderNumber;
    String firstName;
    String lasName;
    String email;
    Double total;
    List<OrderItemDto> items;

    public OrderDto() {
    }

//    @Override
//    public String toString() {
//        String productsS = "";
//
//        for (String key : vendors.keySet()) {
//
//            List<String[]> products = vendors.get(key);
//            productsS = Arrays.toString(products.get(0)) + " " + Arrays.toString(products.get(1)) + "\n";
//
//        }
//
//        return "OrderDto{" +
//                "firstName='" + firstName + '\'' +
//                ", lasName='" + lasName + '\'' +
//                ", email='" + email + '\'' +
//                ", vendors=" + productsS +
//                '}';
//    }
}
