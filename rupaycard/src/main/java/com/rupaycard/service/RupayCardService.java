package com.rupaycard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rupaycard.dao.RupayCardDAOInterface;
import com.rupaycard.entity.Card;

@Service
@Transactional
public class RupayCardService implements RupayCardServiceInterface{
	
	@Autowired
	private RupayCardDAOInterface  rDao;

	@Override
	public Card createCardService(Card cc) {
		rDao.save(cc);
		return cc;
	}

}









