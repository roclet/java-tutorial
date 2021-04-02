package com.lijoce.apilijoce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "province")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    private int appId;
    @Column(name = "province")
    private String province;
    @Column(name = "submission_date")
    private String submission_date;
    @Column(name = "modified")
    private Date modified;
}
