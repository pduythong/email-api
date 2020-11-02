package cs490.notification.email.proxy.impl;

import cs490.notification.email.dto.UserDto;
import cs490.notification.email.proxy.UserProxy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class UserProxyImpl implements UserProxy {

    @Override
    public List<UserDto> getVendors(Set<Long> vendorIds) {
        return null;
    }

    @Override
    public UserDto getUser(Long useId) {
        return null;
    }
}
