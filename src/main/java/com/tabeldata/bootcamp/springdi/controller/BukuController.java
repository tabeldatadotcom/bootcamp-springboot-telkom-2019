package com.tabeldata.bootcamp.springdi.controller;

import com.tabeldata.bootcamp.springdi.entity.Buku;
import com.tabeldata.bootcamp.springdi.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BukuController {

    @Autowired
    private BukuRepository repo;

    @GetMapping(value = "/halo")
    public Buku halo() {
        Optional<Buku> bukuOptional = repo.findById(1);
        if (bukuOptional.isPresent())
            return bukuOptional.get();
        else
            return null;
    }
}
