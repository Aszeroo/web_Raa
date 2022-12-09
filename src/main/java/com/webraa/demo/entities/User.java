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
@Table(name = "T_USER", schema = "PUBLIC")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String tel;
    private String companyName;
    @CreatedDate
    private Date createDate;
    private String createBy;
    @LastModifiedDate
    private Date updateDate;
    private String updateBy;
    private String checklist;
    private String type;
    private String status;
}
