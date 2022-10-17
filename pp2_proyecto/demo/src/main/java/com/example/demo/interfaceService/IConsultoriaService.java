package com.example.demo.interfaceService;

import java.util.*;

import com.example.demo.modelo.Consultoria;

public interface IConsultoriaService {
public List<Consultoria>listar();
public Optional<Consultoria>listarId(int id);
public int save(Consultoria c);
public void delete(int id);

}
