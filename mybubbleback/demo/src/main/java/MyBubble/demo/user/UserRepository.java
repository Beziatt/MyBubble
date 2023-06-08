package MyBubble.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserRepository, Long> {
    List<User> getAllUsers();

    User getUserById(Long id);

    User addUser(User user);

    User updateUser(User user, Long id);

    void deleteUser(Long id);
}
