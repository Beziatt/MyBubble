package MyBubble.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    public User updateUser(User user, Long id) {
        return userRepository.updateUser(user, id);
    }

    public void deleteUser(Long id) {userRepository.deleteUser(id);
    }
}
