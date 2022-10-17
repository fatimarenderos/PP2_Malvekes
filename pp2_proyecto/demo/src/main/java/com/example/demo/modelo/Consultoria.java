package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;



@Entity
@Table(name = "consultoria")

public class Consultoria {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String consultor;
private String fecha;
private String hora;

 public Consultoria() {
	 
 }

 public Consultoria(int id, String consultor, String fecha, String hora) {
	super();
	this.id = id;
	this.consultor = consultor;
	this.fecha = fecha;
	this.hora = hora;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getConsultor() {
	return consultor;
}

public void setConsultor(String consultor) {
	this.consultor = consultor;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

 
 
}
