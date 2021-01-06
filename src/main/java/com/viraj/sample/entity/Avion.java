package com.viraj.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AVION")
public class Avion {
    
      @Id
    @Column(name = "AVION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer avionId;

    @Column(name = "AVION_NAME")
    private String avionName;

    @Column(name = "AVION_MARQUE")
    private String avionMarque;

    @Column(name = "AVION_nbrP")
    private int avionNbrP; 

    public Avion() {
    }

    public Avion(String avionName, String avionMarque , int avionNbrP) {
        this.avionName = avionName;
        this.avionMarque = avionMarque;
        this.avionNbrP= avionNbrP;
    }
    public Integer getAvionId(){
        return avionId;
    }
    public String getAvionName() {
        return avionName;
    }

    public void setAvionName(String avionName) {
        this.avionName = avionName;
    }

    public String getAvionMarque() {
        return avionMarque;
    }

    public void setAvionMarque(String avionMarque) {
        this.avionMarque = avionMarque;
    }
    public int getAvionNbrP() {
        return avionNbrP;
    }

    public void setAvionNbrP(int avionNbrP) {
        this.avionNbrP = avionNbrP;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "avionId=" + avionId +
                ", avionName='" + avionName + '\'' +
                ", avionMarque='" + avionMarque + '\'' +
                ", avionNbrP='" + avionNbrP + '\'' + '}';
    }
    
}
