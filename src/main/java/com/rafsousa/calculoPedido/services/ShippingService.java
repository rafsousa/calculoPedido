package com.rafsousa.calculoPedido.services;

import org.springframework.stereotype.Service;


@Service
public class ShippingService {
	
	private double shipping;
	
	public double shipment(double amount) {
		shipping = 0; // Frete gratis

		if (amount < 100) { 
			shipping = 20;
		} else if (amount >= 100 && amount < 200) {
			shipping = 12;
		}
		
		return shipping;
	}

}
