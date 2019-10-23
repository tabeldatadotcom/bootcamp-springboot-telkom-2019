package com.tabeldata.bootcamp.springdi;

import com.tabeldata.bootcamp.springdi.bean.KelasA;
import com.tabeldata.bootcamp.springdi.bean.KelasB;
import com.tabeldata.bootcamp.springdi.bean.KelasC;

public class SpringDiApplication {

    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        KelasB kelasB = new KelasB();
        KelasC kelasC = new KelasC();

        kelasA.setKelasB(kelasB);

        kelasB.setKelasC(kelasC);

        kelasC.setNamaLengkap("Dimas Maryanto");

        System.out.println(kelasA.getKelasB().getKelasC().getNamaLengkap());
    }

}
