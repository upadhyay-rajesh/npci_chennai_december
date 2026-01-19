package com.cbdc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Token {

	private String tokenName;
	private long tokenValue;
	@Id
	private long tokenId;
	private String tokenissuer;
	public String getTokenName() {
		return tokenName;
	}
	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}
	public long getTokenValue() {
		return tokenValue;
	}
	public void setTokenValue(long tokenValue) {
		this.tokenValue = tokenValue;
	}
	public long getTokenId() {
		return tokenId;
	}
	public void setTokenId(long tokenId) {
		this.tokenId = tokenId;
	}
	public String getTokenissuer() {
		return tokenissuer;
	}
	public void setTokenissuer(String tokenissuer) {
		this.tokenissuer = tokenissuer;
	}
	
	
	
	
}
