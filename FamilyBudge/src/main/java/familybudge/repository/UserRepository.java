package familybudge.repository;

import familybudge.entity.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsernameAndPassword(String username, String password);
    User findByUsername(String username);
}
