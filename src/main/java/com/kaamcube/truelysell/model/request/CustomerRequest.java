package com.kaamcube.truelysell.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerRequest {
    private Long id;
    @NotBlank(message = "Name is notNull")
    private String name;
    @NotBlank(message = "Email is notNull")
    private String email;
    @NotBlank(message = "Password is notNull")
    private String password;
    @NotBlank(message = "CountryCode is notNull")
    private int countryCode;
    @NotBlank(message = "MobileNumber is notNull")
    private String mobileNumber;
    @NotBlank(message = "OTP is mandatory")
    private String otp;
    @NotBlank(message = "DateOfBirth is notNull")
    private String dateOfBirth;
    @NotBlank(message = "TermsAndCondition is notNull")
    private Boolean termsAndCondition;
    @NotBlank(message = "Address is notNull")
    private String address;
    @NotBlank(message = "Country is notNull")
    private String country;
    @NotBlank(message = "State is mandatory")
    private String state;
    @NotBlank(message = "City is notNull")
    private String city;
    @NotBlank(message = "PostalCode is notNull")
    private int postalCode;
    @NotBlank(message = "CreatedDate is notNull")
    private String createdDate;
    @NotBlank(message = "UpdatedDate is notNull")
    private String updatedDate;

}
