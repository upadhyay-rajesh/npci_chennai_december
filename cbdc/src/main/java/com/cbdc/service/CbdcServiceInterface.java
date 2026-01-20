package com.cbdc.service;

import java.util.List;

import com.cbdc.entity.Token;

public interface CbdcServiceInterface {

	Token createTokenService(Token tk);

	List<Token> getAllTokenService();

	Token getTokenService(long tid);

	String editTokenService(Token t2);

	String deleteTokenService(long tid);

}
