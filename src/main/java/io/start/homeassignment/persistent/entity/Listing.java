package io.start.homeassignment.persistent.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listing")
public class Listing {
    @Column
    @Id
    @JsonIgnore
    private Long sessionId;
    @Column
    @JsonProperty("advertisingId")
    private Long advertiserId;
    @Column
    private String country;
    @Column
    private Double price;
    @Column
    private Integer eventTypeId;
    @Column
    private Integer gdpr;
    @Column
    private Double minCpm;
    @Column
    private Double priority;
    @Column
    private Double bidPrice;

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Long getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(Long advertiserIdd) {
        this.advertiserId = advertiserId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public Integer getGdpr() {
        return gdpr;
    }

    public void setGdpr(Integer gdpr) {
        this.gdpr = gdpr;
    }

    public Double getMinCpm() {
        return minCpm;
    }

    public void setMinCpm(Double minCpm) {
        this.minCpm = minCpm;
    }

    public Double getPriority() {
        return priority;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }
}
