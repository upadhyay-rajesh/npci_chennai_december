package com.cbdc.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Token> getAllTokenService() {
		// TODO Auto-generated method stub
		return cDao.findAll();
	}

	@Override
	public Token getTokenService(long tid) {
		Optional<Token> ttt= cDao.findById(tid);
		return ttt.get();
	}

	@Override
	public String editTokenService(Token t2) {
		cDao.saveAndFlush(t2);
		return "edited";
	}

	@Override
	public String deleteTokenService(long tid) {
		cDao.deleteById(tid);
		return "deleted";
	}

}
