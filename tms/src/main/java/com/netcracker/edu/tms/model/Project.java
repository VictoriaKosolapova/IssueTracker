package com.netcracker.edu.tms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "project")

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)

    private BigInteger id;

    @Column(name = "creator_id")
    private BigInteger creator_id;

    @Column(name = "list_of_users_id")
    private  BigInteger list_of_users_id;

    @Column(name = "name")
    private String name;

    /*@Column(name = "list_of_tasks_id")
    private BigInteger list_of_tasks_id;*/

}
