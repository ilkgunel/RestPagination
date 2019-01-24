package com.ilkaygunel.controller;

import com.ilkaygunel.entity.Characters;
import com.ilkaygunel.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
