package pe.edu.pucp.a20130095.myfirstloginrest.db.controller;

import org.springframework.data.repository.CrudRepository;

import pe.edu.pucp.a20130095.myfirstloginrest.db.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByUsername(String username);
}
