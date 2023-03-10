package repo;

import org.springframework.data.repository.CrudRepository;

import entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
