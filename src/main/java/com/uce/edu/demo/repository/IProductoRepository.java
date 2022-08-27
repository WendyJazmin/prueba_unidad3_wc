package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import com.uce.edu.demo.repository.modelo.Producto;



public interface IProductoRepository {

	public void insertar(Producto producto);
	

	
	public Producto buscarProductoPorCodigo(String codigo);
	
	public int actualizarPorPrecio(BigDecimal precio);
	
	public void actualizarProducto(Producto producto);
}
