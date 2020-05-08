package match.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}


/*UserDetails object that Spring Security can use for authentication and validation
UserDetails contains necessary information (such as: username, password, authorities) 
to build an Authentication object*/