package com.cbdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping
	public List<Token> getAll(){
		return cService.getAllTokenService();
	}
	
	@GetMapping("{tid}")
	public Token get(@PathVariable("tid") long tid) {
		return cService.getTokenService(tid);
	}
	@PutMapping("{tid}")
	public String edit(@PathVariable("tid") long tid,@RequestBody Token t2) {
		return cService.editTokenService(t2);
	}
	@DeleteMapping("{tid}")
	public String delete(@PathVariable("tid") long tid) {
		return cService.deleteTokenService(tid);
	}

}
