package com.creditcard.service;

import org.springframework.stereotype.Service;

import com.creditcard.entity.Card;

@Service
public class CreditCardService implements CreditCardServiceInterface {

	@Override
	public String createProfileService(Card cc) {
		// TODO Auto-generated method stub
		return "profile created in service layer "+cc.getName()+" "+cc.getAmount()+" "+cc.getCardNumber()+" "+cc.getCardType()+"  "+cc.getCvv();
		
	}

	@Override
	public String editProfileService(String cNumber, String cvv, Card cc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProfileService(String cNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card viewProfileService(String cNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
