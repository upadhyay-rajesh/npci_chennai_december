package com.cbdcconsumer1.controller;

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
import org.springframework.web.client.RestTemplate;

import com.cbdcconsumer1.dto.Token;

@RestController
@RequestMapping("api/v1/cbdcconsumer")
public class CbdcController1 {
	
	@Autowired
	RestTemplate rTemp;
	
	@GetMapping
	public List<Token> get(){
		
		//RestTemplate rTemp = new RestTemplate();
		List<Token> tt =rTemp.getForObject("http://localhost:10000/api/v1/cbdc", List.class);
		
		return tt;
		
	}
	
	@GetMapping("/{tokenId}")
	public Token getRecord(@PathVariable("tokenid") long tid){
		
		//RestTemplate rTemp = new RestTemplate();
		Token tt =rTemp.getForObject("http://localhost:10000/api/v1/cbdc/"+tid, Token.class);
		
		return tt;
		
	}
	
	@PostMapping
	public Token create(@RequestBody Token tt) {
		Token tt1 =rTemp.postForObject("http://localhost:10000/api/v1/cbdc", tt, Token.class);
		return tt1;
	}
	
	@PutMapping("/{tokenId}")
	public String editRecord(@PathVariable("tokenid") long tid, @RequestBody Token tt){
		rTemp.put("http://localhost:10000/api/v1/cbdc/"+tid, tt);
		return "Token edited";
	}
	
	
	@DeleteMapping("/{tokenId}")
	public String deleteRecord(@PathVariable("tokenid") long tid){
		rTemp.delete("http://localhost:10000/api/v1/cbdc/"+tid);
		return "Token deleted";
	}
	
	
	
	
	
	
	
	
	
}
