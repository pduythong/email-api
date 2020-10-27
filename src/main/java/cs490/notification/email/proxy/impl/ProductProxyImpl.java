package cs490.notification.email.proxy.impl;

import cs490.notification.email.dto.UserDto;
import cs490.notification.email.proxy.ProductProxy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class ProductProxyImpl implements ProductProxy {

    @Override
    public List<UserDto> getVendors(Set<Long> vendorIds) {
        return null;
    }
}
