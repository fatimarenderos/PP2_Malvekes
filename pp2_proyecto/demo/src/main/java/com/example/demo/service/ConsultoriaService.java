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

		return data.findById(id);
	}

	@Override
	public int save(Consultoria c) {
		int res=0;
		Consultoria consultoria =data.save(c);
		if(!consultoria.equals(null)) {
			res=1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
