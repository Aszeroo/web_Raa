package com.webraa.demo.repositories;

import com.webraa.demo.entities.User;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends DataTablesRepository<User, String> {

    Optional<User> findByUsername(String userName);

    List<User> findByFirstName(String firstName);

}
