package com.tabeldata.bootcamp.springdi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KelasC {

    @Value("Dimas Maryanto")
    private String namaLengkap;

    @Autowired
    private KelasD kelasD;

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public KelasD getKelasD() {
        return kelasD;
    }

    public void setKelasD(KelasD kelasD) {
        this.kelasD = kelasD;
    }
}
