package cs490.notification.email.proxy;

import cs490.notification.email.dto.ProductDto;
import cs490.notification.email.dto.UserDto;

import java.util.List;
import java.util.Set;

public interface UserProxy {
    List<UserDto> getVendors(Set<Long> vendorIds);

}
