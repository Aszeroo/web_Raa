package com.webraa.demo.repositories;

import com.webraa.demo.entities.Questions;
import com.webraa.demo.entities.User;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends DataTablesRepository<Questions, String> {

    List<Questions> findAll();

}
