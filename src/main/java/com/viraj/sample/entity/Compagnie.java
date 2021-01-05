package com.viraj.sample.entity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "COMPAGNIE")

public class Compagnie {
   



    @Id
    @Column(name = "COMPAGNIE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer compagnieId;

    @Column(name = "COMPAGNIE_NAME")
    private String compagnieName;

    @Column(name = "COMPAGNIE_PAYS")
    private String compagniePays;

    public Compagnie() {
    }

    public Compagnie(Integer compagnieId,String compagnieName, String compagniePays) {
        this.compagnieId= compagnieId;
        this.compagnieName = compagnieName;
        this.compagniePays = compagniePays;
    }

    public String getCompagnieName() {
        return compagnieName;
    }

    public Integer getCompagnieId() {
        return compagnieId;
    }

    public void setCompagnieName(String compagnieName) {
        this.compagnieName = compagnieName;
    }

    public String getCompagniePays() {
        return compagniePays;
    }

    public void setCompagniePays(String compagniePays) {
        this.compagniePays = compagniePays;
    }

    @Override
    public String toString() {
        return 
                  compagnieId.toString();
    }
}


