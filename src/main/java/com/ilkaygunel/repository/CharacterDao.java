package com.ilkaygunel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.ilkaygunel.entity.Characters;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends CrudRepository<Characters, Long> {
    Page<Characters> findAll(Pageable pageable);
}
