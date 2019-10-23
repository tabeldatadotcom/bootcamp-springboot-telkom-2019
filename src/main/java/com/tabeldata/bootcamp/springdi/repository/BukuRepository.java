package com.tabeldata.bootcamp.springdi.repository;

import com.tabeldata.bootcamp.springdi.entity.Buku;
import org.springframework.data.repository.CrudRepository;

public interface BukuRepository extends CrudRepository<Buku, Integer> {
}
