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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(Integer tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public Date getTanggalTerbit() {
        return tanggalTerbit;
    }

    public void setTanggalTerbit(Date tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }

    @Override
    public String toString() {
        return String.format("nama: %s, tahunTerbit: %s, tanggalTerbit:  %s",
                this.nama, this.tahunTerbit, this.tanggalTerbit);
    }
}
