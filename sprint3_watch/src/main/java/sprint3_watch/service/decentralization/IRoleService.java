package sprint3_watch.service.decentralization;



import sprint3_watch.model.decentralization.Role;

import java.util.List;

public interface IRoleService {

    List<Role> findAllRole();

    List<Role> getAllRoles();

    void saveCreateGmail(String email);


    List<Role> getRoleByUsername(String email);

}
