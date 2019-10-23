package com.tabeldata.bootcamp.springdi.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KelasD {

    @Autowired
    private KelasE kelasE;

    public KelasE getKelasE() {
        return kelasE;
    }

    public void setKelasE(KelasE kelasE) {
        this.kelasE = kelasE;
    }
}
