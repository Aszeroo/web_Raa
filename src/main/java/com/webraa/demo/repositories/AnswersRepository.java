package com.webraa.demo.repositories;

import com.webraa.demo.entities.Answers;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

public interface AnswersRepository extends DataTablesRepository<Answers, String> {
}
