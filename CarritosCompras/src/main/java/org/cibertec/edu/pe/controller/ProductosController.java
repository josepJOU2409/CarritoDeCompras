package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductosService;
import org.cibertec.edu.pe.model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductosController {
	
	@Autowired
	private IProductosService servicio; 
	
	//listar
	@GetMapping("/listar")
	public String Listado(Model m) {
		List<Productos> lista = servicio.Listar();
		m.addAttribute("producto", lista);
		return "listado";
	}
	
	@GetMapping("/search/{id}")
	public String search(@PathVariable String id, Model m) {
		Optional<Productos> p = servicio.search(id);
		m.addAttribute("producto", p);
		return "searchProductById";
	}
	
	@GetMapping("/create")
	public String create(Model m) {
		m.addAttribute("producto", new Productos());
		return "createNewProduct";
	}
	
	@PostMapping("/save")
	public String save(@Validated Productos p, Model m) {
		servicio.save(p);
		return "redirect:/list";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable String id, Model m) {
		Optional<Productos> p = servicio.search(id);
		m.addAttribute("producto", p);
		return "updateProduct";
	}
	
	@GetMapping("/delete")
	public String delete(@PathVariable String id, Model m) {
		servicio.delete(id);
		return "redirect:/list";
	}
}
