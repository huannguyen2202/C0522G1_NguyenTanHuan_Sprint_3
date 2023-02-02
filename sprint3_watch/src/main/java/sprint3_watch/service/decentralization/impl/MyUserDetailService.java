package sprint3_watch.service.decentralization.impl;

//import com.example.sprintbe.model.decentralization.User;
//import com.example.sprintbe.repository.decentralization.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sprint3_watch.model.decentralization.User;
import sprint3_watch.repository.decentralization.IUserRepository;


@Service
@Transactional
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Tài khoản: " + username + "Không tồn tại !");
        }
        return new MyUserDetails(user);
    }
}
