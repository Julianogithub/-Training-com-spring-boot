package com.juliano.training.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliano.training.domain.Categoria;
import com.juliano.training.repositories.CategoriaRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public void instantiateTestDatabase() throws ParseException{
		
		Categoria cat1 = new Categoria(null, "InformáticaJulia");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
			
	}
}
