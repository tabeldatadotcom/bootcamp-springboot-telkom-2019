package com.tabeldata.bootcamp.springdi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KelasB {

    @Autowired
    private KelasC kelasC;

    public KelasC getKelasC() {
        return kelasC;
    }

    public void setKelasC(KelasC kelasC) {
        this.kelasC = kelasC;
    }

    public void printKelasC(){
        System.out.println(kelasC.getNamaLengkap());
    }


}
