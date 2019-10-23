package com.tabeldata.bootcamp.springdi.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KelasE {

    @Value("1")
    private Integer umur;

    private Integer klik;

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}
