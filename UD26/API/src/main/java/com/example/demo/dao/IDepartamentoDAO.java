package com.example.demo.dao;

import java.util.List;
import com.example.demo.statics.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Departamento;
import com.example.demo.dto.Empleado;

@Repository
public interface IDepartamentoDAO extends JpaRepository<Departamento, Long>{
	public Departamento findByCodigo(int codigo);
	public List<Departamento> findByNombre(String nombre);
	public List<Departamento> findByPresupuestoGreaterThanEqual(int presupuesto);
	public List<Departamento> removeByCodigo(int codigo);
}