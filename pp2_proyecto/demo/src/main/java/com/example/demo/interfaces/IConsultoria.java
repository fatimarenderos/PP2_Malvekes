package com.example.demo.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Consultoria;

@Repository
public interface IConsultoria extends CrudRepository <Consultoria, Integer>{

}
