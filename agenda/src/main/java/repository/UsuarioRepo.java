package repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

import model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, String> {
	
	Optional<User> findByUsername(String username);

}
