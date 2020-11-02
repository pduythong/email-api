package cs490.notification.email.proxy.impl;

import cs490.notification.email.dto.ProductDto;
import cs490.notification.email.dto.UserDto;
import cs490.notification.email.proxy.ProductProxy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class ProductProxyImpl implements ProductProxy {
    @Override
    public List<ProductDto> getProducts(Set<Long> ProductIds) {
        return null;
    }
}
