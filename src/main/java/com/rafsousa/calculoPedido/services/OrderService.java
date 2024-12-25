package com.rafsousa.calculoPedido.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafsousa.calculoPedido.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;

	@Autowired
	private DiscountService discountService;

	public double total(Order order) { 
		return (order.getBasic() - discountService.discount(order)) 
				+ shippingService.shipment(order.getBasic());
	}
	
}
