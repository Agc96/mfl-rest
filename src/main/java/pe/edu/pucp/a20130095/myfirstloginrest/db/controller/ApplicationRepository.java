package pe.edu.pucp.a20130095.myfirstloginrest.db.controller;

import org.springframework.data.repository.CrudRepository;

import pe.edu.pucp.a20130095.myfirstloginrest.db.model.Application;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {
    Application findFirstByName(String name);
}
