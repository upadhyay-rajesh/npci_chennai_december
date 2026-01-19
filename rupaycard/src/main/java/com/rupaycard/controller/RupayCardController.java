package com.rupaycard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rupaycard.entity.Card;
import com.rupaycard.service.RupayCardServiceInterface;

@RestController
@RequestMapping("api/v1/rupaycard")
public class RupayCardController {
	
	@Autowired
	private RupayCardServiceInterface rService;

	@PostMapping
	public Card createCard(@RequestBody Card cc) {
		return rService.createCardService(cc);
	}
}
