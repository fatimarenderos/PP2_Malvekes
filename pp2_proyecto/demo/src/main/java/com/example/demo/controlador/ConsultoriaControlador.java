package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("consultoria", new Consultoria());
		return "form";
	}
	
	@PostMapping("/save")
	public String save( Consultoria c , Model model) {
		service.save(c);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id , Model model) {
		Optional<Consultoria>consultoria=service.listarId(id);
		model.addAttribute("consultoria", consultoria);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id ) {
		service.delete(id);
		return "redirect:/listar";
	}
	
	
}
