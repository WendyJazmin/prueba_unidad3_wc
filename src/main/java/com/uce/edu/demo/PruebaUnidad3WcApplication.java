package com.uce.edu.demo;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.service.IGestorProductoService;
import com.uce.edu.demo.service.IProductoService;

@SpringBootApplication
public class PruebaUnidad3WcApplication implements CommandLineRunner{
	
	@Autowired
	private IGestorProductoService IGestorProductoService;
	
	@Autowired
	private IProductoService IProductoService;

	private static Logger logg = Logger.getLogger( PruebaUnidad3WcApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad3WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Producto producto = new Producto();
		producto.setNombre("Atun");
		producto.setCategoria("Enlatados");
		producto.setCodigo("2wqde");
		producto.setPrecio(new BigDecimal(1.20));
		producto.setStock(50);
		
		//this.IGestorProductoService.insertarProducto("2324355F");
		this.IProductoService.insertar(producto);
	
	}

}
