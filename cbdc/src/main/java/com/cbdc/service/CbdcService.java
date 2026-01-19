package com.cbdc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cbdc.dao.CbdcDAOInterface;
import com.cbdc.entity.Token;

@Service
@Transactional
public class CbdcService implements CbdcServiceInterface {
	
	@Autowired
	private CbdcDAOInterface cDao;

	@Override
	public Token createTokenService(Token tk) {
		cDao.save(tk);
		return tk;
	}

}
