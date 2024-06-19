package com.sb.sdjpa.crud.model;

import com.sb.sdjpa.crud.enums.CustomerStatus;

import jakarta.persistence.GenerationType;
import jakarta.persistence.TemporalType;
import jakarta.persistence.EnumType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.Builder;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
@Entity
@Table(name = "customer_details")
public class CustomerModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "password")
    private String customerPassword;

    @Column(name = "customer_age")
    private int customerAge;

    @Column(name = "customer_mobile_number")
    private String customerMobileNumber;

    @Column(name = "customer_email_address")
    private String customerEmailAddress;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "status")
    private CustomerStatus status;

    @Column(name = "otp")
    private String customerOtp;

    @Column(name = "verified")
    private boolean verified;

    @Column(name = "created_by")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "updated_by")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private LocalDateTime updatedDate;
}
