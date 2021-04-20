package com.zxd.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="students")
public class Students {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(columnDefinition="BIGINT comment '主键，学生编号，自动生成'")
    private long StudentId;

    @Column(columnDefinition="varchar(255) comment '学生姓名' not null")
    private String StudentName;

    @Column(columnDefinition="varchar(255) comment '学生密码，加密过后的' not null")
    private String PassWord;

    @Column(columnDefinition="varchar(255) comment '身份证号' not null")
    private String IDNumber;

    @Column(columnDefinition = "varchar(255) comment '家庭住址'")
    private String Address;

    @Column(columnDefinition = "varchar(255) comment '联系电话'")
    private String Phone;

    @Column(columnDefinition = "varchar(255) comment '邮箱'")
    private String Email;

    @Column(columnDefinition="int comment '年级编号' not null")
    private Integer GradeId;
}
