package com.dencofamily.popeyes.punch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dc_stores")
public class Dcstore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "store_id")
    private int storeId;

    @Column(name = "description")
    private String description;

    @Column(name = "number")
    private String number;

    @Column(name = "hidden")
    private String hidden;

    @Column(name = "subscription_group_id")
    private String subscriptionGroupId;

    @Column(name = "fiscal_calendar_id")
    private String fiscalCalendarId;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public String getSubscriptionGroupId() {
        return subscriptionGroupId;
    }

    public void setSubscriptionGroupId(String subscriptionGroupId) {
        this.subscriptionGroupId = subscriptionGroupId;
    }

    public String getFiscalCalendarId() {
        return fiscalCalendarId;
    }

    public void setFiscalCalendarId(String fiscalCalendarId) {
        this.fiscalCalendarId = fiscalCalendarId;
    }
}
