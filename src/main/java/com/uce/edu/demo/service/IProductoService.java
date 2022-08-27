package com.uce.edu.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;


import com.uce.edu.demo.repository.modelo.Producto;

public interface IProductoService {

	public void insertar(Producto producto);
	
	public Producto buscarProductoPorCodigo(String codigo);
	
	public int actualizarPorPrecio(BigDecimal precio);
}
