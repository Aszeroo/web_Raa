package com.webraa.demo.repositories;

import com.webraa.demo.entities.User;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends DataTablesRepository<User, String> {

    List<User> findByUsername(String userName);

    List<User> findByFirstName(String firstName);

    Optional<User> findByUsernameAndPassword(String userName, String password);

}
