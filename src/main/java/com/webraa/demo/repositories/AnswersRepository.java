package com.webraa.demo.repositories;

import com.webraa.demo.entities.Answers;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnswersRepository extends DataTablesRepository<Answers, String> {

    @Query(value = "select topic_id,topic_name,sum(ans_yes) ans_yes,sum(ans_no) ans_no from \n" +
            "(select c.topic_id,a.question_id,c.topic_name || '('||c.topic_code||')' topic_name,answer,case when answer='yes' then 1 else 0 end as ans_yes,case when answer='no' then 1 else 0 end as ans_no from t_questions a \n" +
            "join t_answers b on a.question_id=b.question_id join t_topics c on a.topic_id=c.topic_id where b.create_by = :userName) a group by topic_id,topic_name order by topic_id", nativeQuery = true)
    List<String> summaryAnswer(@Param("userName") String userName);

}
