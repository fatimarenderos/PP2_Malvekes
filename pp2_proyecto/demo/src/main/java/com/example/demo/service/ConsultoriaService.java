package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IConsultoriaService;
import com.example.demo.interfaces.IConsultoria;
import com.example.demo.modelo.Consultoria;

@Service
public class ConsultoriaService implements IConsultoriaService {

	@Autowired
	private IConsultoria data;
	@Override
	public List<Consultoria> listar() {
		return (List<Consultoria>) data.findAll();
	}

	@Override
	public Optional<Consultoria> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Consultoria c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
