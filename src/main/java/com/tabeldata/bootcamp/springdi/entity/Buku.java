package com.tabeldata.bootcamp.springdi.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "buku")
public class Buku {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kode")
    private Integer id;

    @Column(name = "nama_buku")
    private String nama;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "tahun_tebir")
    private Integer tahunTerbit;

    @Column(name = "tangagl_terbit")
    public Date tanggalTerbit;
}
