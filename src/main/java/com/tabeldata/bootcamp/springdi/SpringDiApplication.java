package com.tabeldata.bootcamp.springdi;

import com.tabeldata.bootcamp.springdi.entity.Buku;
import com.tabeldata.bootcamp.springdi.repository.BukuRepository;
import com.tabeldata.bootcamp.springdi.spring.KelasA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Date;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(SpringDiApplication.class, args);
        BukuRepository repo = container.getBean(BukuRepository.class);

        Buku buku = new Buku();
        buku.setNama("Pemograman Java");
        buku.setIsbn("1234324321");
        buku.setTahunTerbit(2019);
        buku.setTanggalTerbit(Date.valueOf("2019-10-23"));
        repo.save(buku);
    }

}
