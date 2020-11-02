package cs490.notification.email.proxy;

import cs490.notification.email.dto.UserDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.Path;
import java.util.List;
import java.util.Set;

//@FeignClient(name="netflix-zuul-api-gateway-server")
//@RibbonClient(name="user-service")
@FeignClient(name = "USER-SERVICE")
public interface UserProxy {

    @GetMapping("/users/{ids}")
    List<UserDto> getVendors(@PathVariable Set<Long> ids);

    @GetMapping("/users/{id}")
    UserDto getUser(@PathVariable Long id);

}
