package com.webraa.demo.repositories;

import com.webraa.demo.entities.Answers;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnswersRepository extends DataTablesRepository<Answers, String> {

    @Query(value = "select topic_id,sum(ans_yes) ans_yes,sum(ans_no) ans_no from \n" +
            "(select a.question_id,topic_id,answer,case when answer='yes' then 1 else 0 end as ans_yes,case when answer='no' then 1 else 0 end as ans_no from t_questions a \n" +
            "join t_answers b on a.question_id=b.question_id where b.create_by = :userName) a group by topic_id order by topic_id", nativeQuery = true)
    List<String> summaryAnswer(@Param("userName") String userName);

}
