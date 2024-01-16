package com.user.AccountService.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "LGL_PHARMACY")
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LGL_PHARMACY_ID", nullable = false)

    private Long id;

    @Column(name = "LGL_PHARMACY_NAME", nullable = false)
    private String name;

    @Column(name = "LGL_PHARMACY_EMAIL", nullable = false)
    private String email;

    @Column(name = "LGL_PHARMACY_PHONE", nullable = false)
    private String phone;
    @Column(name = "LGL_PHARMACY_ADDRESS", nullable = false)
    private String address;

    @Column(name = "LGL_PHARMACY_WILLAYA", nullable = false)
    private String willaya;

    @Column(name = "LGL_PHARMACY_LATITUDE", nullable = false)
    private double latitude;

    @Column(name = "LGL_PHARMACY_LONGITUDE", nullable = false)
    private double longitude;

    @Column(name = "LGL_PHARMACY_CLUSTER", nullable = false)
    private int cluster;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "LGL_USER_ID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User usr;

    public Pharmacy(String name,
                    String address, String willaya, String email, String phone) {

        this.name = name;
        this.address = address;
        this.willaya = willaya;
        this.email = email;
        this.phone = phone;
        this.latitude = 0;
        this.longitude = 0;
        this.cluster = -1;

    }

}
