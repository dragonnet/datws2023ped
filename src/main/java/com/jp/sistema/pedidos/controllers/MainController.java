package com.jp.sistema.pedidos.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jp.sistema.pedidos.entity.Pedidos;

@Controller
public class MainController {

	@GetMapping(value = {"/index", "/"})
	public String main(Model model) {
		model.addAttribute("titulo", "Puramatic | Generacion de Reportes");
		return "main";
	}
	
	@GetMapping(value="/pedido")
	public String pedido(Model model) {
		
		List<Pedidos> listPedidos =new ArrayList<>();
		
		listPedidos.add(new Pedidos("PT0001","LOMPZIL DESPENSADOR X 24 TAB",25.5,2.0));
		listPedidos.add(new Pedidos("PT0002","NOVEZOL 500 mg X 8 TAB",30.2,22.0));
		listPedidos.add(new Pedidos("PT0003","CLORDIAX COMPUESTO DISP X 240 TAB",28.5,42.0));
		listPedidos.add(new Pedidos("PT0004","SIMBRA 400 mg X 14 TAB",15.5,10.0));
		
		double totalPedido = 0.0;
		for (Pedidos pedido : listPedidos) {
			totalPedido = totalPedido + (pedido.getCantidad() * pedido.getPrecio());
		}
		
		model.addAttribute("total", totalPedido);
		model.addAttribute("pedidos", listPedidos);
		return "pedido";
	}
}
