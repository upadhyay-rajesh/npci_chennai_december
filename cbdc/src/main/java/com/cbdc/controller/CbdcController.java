package com.cbdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbdc.entity.Token;
import com.cbdc.service.CbdcServiceInterface;

@RestController
@RequestMapping("api/v1/cbdc")
public class CbdcController {
	
	@Autowired
	private CbdcServiceInterface cService;
	
	@PostMapping
	public Token createToken(@RequestBody Token tk) {
		return cService.createTokenService(tk);
	}

}
