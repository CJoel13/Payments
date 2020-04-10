package com.cris.payments.Service.Impl;

import org.springframework.stereotype.Service;

import com.cris.payments.Service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Override
	public String getExample() {
		return "This is service Example";
	}
	

}
