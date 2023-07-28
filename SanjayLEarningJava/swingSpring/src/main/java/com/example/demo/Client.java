package com.example.demo;
import java.io.Serializable;

import org.springframework.stereotype.Component;

import ch.qos.logback.core.joran.action.ActionUtil.Scope;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Client implements Serializable{
    private static final long serialVersionUID = 2018040801L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String tel;
    private String email;
    private String note;
    
}
