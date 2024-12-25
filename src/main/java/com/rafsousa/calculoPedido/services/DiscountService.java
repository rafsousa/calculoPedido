package com.rafsousa.calculoPedido.services;

import org.springframework.stereotype.Service;

import com.rafsousa.calculoPedido.entities.Order;

@Service
public class DiscountService {

	public double discount(Order order) {
		return order.getBasic() * (order.getDiscount() / 100);
	}

}
