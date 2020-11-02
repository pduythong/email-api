package cs490.notification.email.proxy;

import cs490.notification.email.dto.ProductDto;
import cs490.notification.email.dto.UserDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
import java.util.Set;

//@FeignClient(name="netflix-zuul-api-gateway-server")
//@RibbonClient(name="product-service")
public interface ProductProxy {
    List<ProductDto> getProducts(Set<Long> ProductIds);
}
