package com.ilkaygunel.service;

import com.ilkaygunel.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ilkaygunel.entity.Characters;
import com.ilkaygunel.repository.CharacterDao;

@Service
public class CharacterService {

    @Autowired
    private CharacterDao characterDao;

    public Page<Characters> getPaginatedCharacters(int pageNumber) {
        PageRequest pageable = PageRequest.of(pageNumber - 1, 2);
        Page<Characters> resultPage = characterDao.findAll(pageable);
        if (pageNumber > resultPage.getTotalPages()) {
            throw new ResourceNotFoundException("Not Found Page Number:" + pageNumber);
        }
        return characterDao.findAll(pageable);
    }
}
