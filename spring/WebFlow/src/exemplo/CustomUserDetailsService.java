package exemplo;

import org.springframework.dao.DataAccessException;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.GrantedAuthorityImpl;
import org.springframework.security.userdetails.UserDetails;
import org.springframework.security.userdetails.UserDetailsService;
import org.springframework.security.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		
		if ("david".equals(username)) {
			Usuario u = new Usuario();
			u.setUsername("david");
			u.setPassword("1234");
			u.setAuthorities(new GrantedAuthority[] { new GrantedAuthorityImpl("ROLE_USER") });
			return u;
		} else if ("joao".equals(username)){
			Usuario u = new Usuario();
			u.setUsername("joao");
			u.setPassword("1234");
			u.setAuthorities(new GrantedAuthority[] { new GrantedAuthorityImpl("ROLE_USER"),new GrantedAuthorityImpl("ROLE_ADMIN") });
			return u;
		}
		
		return null;
	}

}
