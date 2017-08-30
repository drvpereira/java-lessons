package exemplo;

import org.springframework.security.GrantedAuthority;
import org.springframework.security.userdetails.UserDetails;

public class Usuario implements UserDetails {

	private String username;
	
	private String password;
	
	private GrantedAuthority[] authorities;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public GrantedAuthority[] getAuthorities() {
		return authorities;
	}

	public void setAuthorities(GrantedAuthority[] authorities) {
		this.authorities = authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public boolean isUserInRole(String role) {
		for (GrantedAuthority ga : authorities) {
			if (ga.getAuthority().equals(role))
				return true;
		}
		return false;
	}

}
