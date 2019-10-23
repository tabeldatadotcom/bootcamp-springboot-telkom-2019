package com.tabeldata.bootcamp.springdi;

import com.tabeldata.bootcamp.springdi.bean.KelasA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);
        KelasA kelasA = context.getBean(KelasA.class);
        System.out.println(kelasA.getKelasB().getKelasC().getKelasD().getKelasE().getUmur());
    }

}
