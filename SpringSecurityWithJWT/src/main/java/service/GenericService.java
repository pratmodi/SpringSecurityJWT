package service;

import java.util.List;

import entity.RandomCity;
import entity.User;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
