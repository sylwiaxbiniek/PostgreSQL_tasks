package com.biniek.sylwia.zadanie_1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DaneWejsciowe {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nazwaUslugi;
    private String cenaUslugi;

    protected DaneWejsciowe() {}

    public DaneWejsciowe(String nazwaUslugi, String cenaUslugi) {
        this.nazwaUslugi = nazwaUslugi;
        this.cenaUslugi = cenaUslugi;
    }

    @Override
    public String toString() {
        return String.format(
                "DaneWejsciowe[id=%d, nazwaUslugi='%s', cenaUslugi='%s']",
                id, nazwaUslugi, cenaUslugi);
    }

    public Long getId() {
        return id;
    }

    public String getNazwaUslugi() {
        return nazwaUslugi;
    }

    public String getCenaUslugi(){
        return cenaUslugi;
    }

}
