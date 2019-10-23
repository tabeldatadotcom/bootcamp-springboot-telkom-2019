package com.tabeldata.bootcamp.springdi.bean;

public class KelasB {

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
