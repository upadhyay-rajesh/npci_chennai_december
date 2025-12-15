package com.creditcard.service;

import com.creditcard.entity.Card;

public interface CreditCardServiceInterface {

	String createProfileService(Card cc);

	String editProfileService(String cNumber, String cvv, Card cc);

	String deleteProfileService(String cNumber);

	Card viewProfileService(String cNumber);

}
