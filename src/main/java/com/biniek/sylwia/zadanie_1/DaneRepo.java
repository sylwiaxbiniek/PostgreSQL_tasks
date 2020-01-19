package com.biniek.sylwia.zadanie_1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DaneRepo extends CrudRepository<DaneWejsciowe, Long> {

    List<DaneWejsciowe> findByNazwaUslugi(String nazwaUslugi);

    DaneWejsciowe findById(long id);
}
