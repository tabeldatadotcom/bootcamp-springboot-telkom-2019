package com.tabeldata.bootcamp.springdi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KelasA {

    @Autowired
    private KelasB kelasB;

    public void setKelasB(KelasB kelasB) {
        this.kelasB = kelasB;
    }

    public KelasB getKelasB() {
        return kelasB;
    }
}
