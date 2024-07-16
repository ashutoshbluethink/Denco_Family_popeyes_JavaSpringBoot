package com.dencofamily.popeyes.punch.model;

import jakarta.persistence.*;

@Entity
@Table(name = "new_hire_data_details")
public class NewHire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "new_hire_id")
    private Integer newHireId;

    @Column(name = "new_employee_code")
    private String newEmployeeCode;

    @Column(name = "address")
    private String address;

    @Column(name = "apt_suite_other")
    private String aptSuiteOther;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "primary_phone")
    private String primaryPhone;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getNewHireId() {
        return newHireId;
    }

    public void setNewHireId(Integer newHireId) {
        this.newHireId = newHireId;
    }

    public String getNewEmployeeCode() {
        return newEmployeeCode;
    }

    public void setNewEmployeeCode(String newEmployeeCode) {
        this.newEmployeeCode = newEmployeeCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAptSuiteOther() {
        return aptSuiteOther;
    }

    public void setAptSuiteOther(String aptSuiteOther) {
        this.aptSuiteOther = aptSuiteOther;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

}
