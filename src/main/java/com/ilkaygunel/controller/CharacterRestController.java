package com.ilkaygunel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ilkaygunel.entity.Characters;
import com.ilkaygunel.service.CharacterService;

@RestController
@RequestMapping("/")
public class CharacterRestController {

	@Autowired
	private CharacterService characterService;

	@GetMapping("characters")
	@ResponseBody
	public List<Characters> findAllPaginated(@RequestParam("pageNumber") int pageNumber) {
		Page<Characters> resultPage = characterService.getPaginatedCharacters(pageNumber);
		return resultPage.getContent();
	}
}
