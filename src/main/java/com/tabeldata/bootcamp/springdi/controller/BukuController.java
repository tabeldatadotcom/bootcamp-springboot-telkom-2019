package com.tabeldata.bootcamp.springdi.controller;

import com.tabeldata.bootcamp.springdi.entity.Buku;
import com.tabeldata.bootcamp.springdi.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BukuController {

    @Autowired
    private BukuRepository repo;

    @GetMapping(value = "/buku/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        Optional<Buku> bukuOptional = repo.findById(id);
        if (bukuOptional.isPresent())
            return ResponseEntity.ok(bukuOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @GetMapping("/buku/list")
    public Iterable<Buku> listBuku() {
        return repo.findAll();
    }

    @DeleteMapping(value = "/buku/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.noContent().build();
    }

    @PostMapping("/buku")
    public ResponseEntity<?> save(@RequestBody Buku buku) {
        buku = repo.save(buku);
        return ResponseEntity.ok(buku);
    }
}
