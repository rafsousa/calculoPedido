package com.rafsousa.calculoPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafsousa.calculoPedido.entities.Order;
import com.rafsousa.calculoPedido.services.OrderService;

@SpringBootApplication
public class CalculoPedidoApplication implements CommandLineRunner{

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(CalculoPedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Order order = new Order(1034, 150.00, 20);
		System.out.println("Pedido Código " + order.getCode());
		System.out.println("Valor total : R$ " + orderService.total(order));

		System.out.println(" ");
		
		order = new Order(2282, 800.00, 10);
		System.out.println("Pedido Código " + order.getCode());
		System.out.println("Valor total : R$ " + orderService.total(order));

		System.out.println(" ");

		order = new Order(1309, 95.90, 0);
		System.out.println("Pedido Código " + order.getCode());
		System.out.println("Valor total : R$ " + orderService.total(order));
	}

}
