
package com.mycompany.login.persistence;

import com.mycompany.login.logic.User;
import java.util.List;

public class PersistenceController {
    
        UserJpaController userJpa = new UserJpaController();

    public List<User> traerUsers() {
        return userJpa.findUserEntities();
    }
}
