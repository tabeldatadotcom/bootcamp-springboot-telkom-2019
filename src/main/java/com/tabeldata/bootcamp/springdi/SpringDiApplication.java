package com.tabeldata.bootcamp.springdi;

import com.tabeldata.bootcamp.springdi.bean.KelasA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class SpringDiApplication {

    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        System.out.println(kelasA.kelasB.kelasC.namaLengkap);
    }

}
