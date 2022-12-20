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
@Table(name = "T_QUESTIONS", schema = "PUBLIC")
@Getter
@Setter
public class Questions {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String questionId;
    private String questionCode;
    private String questionName;
    private String questionDiscription;
    private String assessmentId;
    private String topicId;
    private String guidance;
    @CreatedDate
    private Date createDate;
    private String createBy;
    @LastModifiedDate
    private Date updateDate;
    private String updateBy;
    private String questionStatus;
}
