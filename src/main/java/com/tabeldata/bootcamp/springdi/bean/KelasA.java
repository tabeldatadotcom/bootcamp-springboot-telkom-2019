package com.tabeldata.bootcamp.springdi.bean;

public class KelasA {

    private KelasB kelasB;

    public void setKelasB(KelasB kelasB) {
        this.kelasB = kelasB;
    }

    public KelasB getKelasB() {
        return kelasB;
    }
}
