package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.IConsultoriaService;
import com.example.demo.modelo.Consultoria;

@Controller
@RequestMapping
public class ConsultoriaControlador {
	
	@Autowired 
	private IConsultoriaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Consultoria> consultorias= service.listar();
		model.addAttribute("consultorias",consultorias );
		return "index";
	}
}
