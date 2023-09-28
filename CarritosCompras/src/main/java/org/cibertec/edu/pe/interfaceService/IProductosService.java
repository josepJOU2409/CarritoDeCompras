package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.model.Productos;

public interface IProductosService {
	public List<Productos> Listar();
	public Optional<Productos> search(String id);
	public int save(Productos p);
	public void delete(String id);
}
