package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductosService;
import org.cibertec.edu.pe.interfaces.IProductos;
import org.cibertec.edu.pe.model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService implements IProductosService{

	@Autowired
	private IProductos data;
	
	@Override
	public List<Productos> Listar() {
		
		return (List<Productos>)data.findAll();
	}

	@Override
	public Optional<Productos> search(String id) {
		return data.findById(id);
		
	}

	@Override
	public int save(Productos p) {
		int rpta = 0;
		Productos Obj = data.save(p);
		if(!Obj.equals(null)) rpta = -1;
		return rpta;
	}

	@Override
	public void delete(String id) {
		data.deleteById(id);
		
	}

}
