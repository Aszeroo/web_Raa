package com.webraa.demo.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "T_ANSWERS", schema = "PUBLIC")
@Getter
@Setter
public class Answers {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String answerId;
    private String questionId;
    private String answer;
    private String answerDiscription;
    private String comment;
    private String roundId;

    @CreatedDate
    private Date createDate;
    private String createBy;
    @LastModifiedDate
    private Date updateDate;
    private String updateBy;
    private String answerStatus;
}
