package model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UsuarioPrincipal implements UserDetails{
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue (strategy = GenerationType.AUTO)
		private long codigo;
		
		private User user;
		
		public UsuarioPrincipal(User user) {
			this.user = user;
		}
		
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities(){
			return null;
		}
		
		@Override
	    public String getPassword() {
	        return user.getPassword();
	    }

	    @Override
	    public String getUsername() {
	        return user.getUsername();
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
}
