package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductos extends JpaRepository<Productos, String>{

}
