package com.cyngofok.global.restapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;
    @Column(name = "vendor_name",nullable = false)
    private String vendorName;
    @Column(name = "vendor_address",nullable = false)
    private String vendorAddress;
    @Column(name = "vendor_phone_number",nullable = false)
    private String vendorPhoneNumber;



    public CloudVendor(String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    @Override
    public String toString() {
        return "CloudVendor{" +
                "vendorId=" + vendorId +
                ", vendorName='" + vendorName + '\'' +
                ", vendorAddress='" + vendorAddress + '\'' +
                ", vendorPhoneNumber='" + vendorPhoneNumber + '\'' +
                '}';
    }

}
