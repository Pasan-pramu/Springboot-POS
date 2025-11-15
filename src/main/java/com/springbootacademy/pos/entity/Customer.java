package com.springbootacademy.pos.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Type;

import java.util.ArrayList;

@Entity
@Table(name = "customer")
@TypeDefs({
        @TypeDef(name="json",typeClass= JsonType.class)
})
public class Customer {

    @Id
    @Column (name = "customer_id",length = 45)
    private int customerId;

    @Column (name = "customer_name",length = 100,nullable = false)
    private String customerName;

    @Column (name = "customer_address",length = 255)
    private String customerAddress;

    @Column (name = "customer_salary",length = 255)
    private double customerSalary;


    @Type(type ="json")
    @Column (name = "contact_numbers",length = 255)
    private ArrayList customerNumber;

    @Column (name = "nic")
    private String nic;

    @Column (name = "active_status"  , columnDefinition = "TINYINT default 1")
    private boolean active;




}
