package com.mobigen.demo2.entity;


// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;
// import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Data

@Table(name="cm_user")

@AllArgsConstructor
@NoArgsConstructor
// @NoArgsConstructor//(access = AccessLevel.PROTECTED)
public class User {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column
    private String email;
    @Column
    private String name;
    
   
    
}

