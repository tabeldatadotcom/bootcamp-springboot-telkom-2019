package com.tabeldata.bootcamp.springdi;

import com.tabeldata.bootcamp.springdi.spring.KelasA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(SpringDiApplication.class, args);
        KelasA kelasA = container.getBean(KelasA.class);
        System.out.println(kelasA.getKelasB().getKelasC().getNamaLengkap());
    }

}
