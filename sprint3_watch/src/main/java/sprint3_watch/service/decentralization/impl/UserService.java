package sprint3_watch.service.decentralization.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sprint3_watch.dto.decentralization.IUserEmailDto;
import sprint3_watch.model.decentralization.User;
import sprint3_watch.repository.decentralization.IUserRepository;
import sprint3_watch.service.decentralization.IUserService;


import java.util.List;
import java.util.Optional;


@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public String existsByUserName(String username) {
        return userRepository.existsByUserName(username);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String name) {
        return userRepository.findByUsername(name);
    }


    @Override
    public void updatePassword(User user, String newPassword) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(newPassword);
        user.setPassword(encodedPassword);
        userRepository.saveNewPassword(encodedPassword,user.getUsername());
    }

    @Override
    public void saveCreateGmail(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> showUsername(String username) {
        return userRepository.showUsername(username);
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public void updateUser(User user, String username) {
        userRepository.saveUser(user, username);
    }

    @Override
    public Optional<IUserEmailDto> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Optional<IUserEmailDto> findByUsernameDto(String username) {
        return userRepository.findByUsernameDto(username);
    }
}