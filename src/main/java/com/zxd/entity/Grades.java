package com.zxd.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "grades")
public class Grades {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(columnDefinition = "int comment '主键，年级编号，自动生成' not null")
    private Integer GradeId;

    @Column(columnDefinition="varchar(255) comment '年级名称' not null")
    private String GradeName;
}
