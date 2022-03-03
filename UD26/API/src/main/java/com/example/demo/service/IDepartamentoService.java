/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamento;
import com.example.demo.dto.Empleado;

/**
 * @author Fenrir
 *
 */
public interface IDepartamentoService {
	public List<Departamento> listarDepartamentos();
	public Departamento buscarDepartamento(int id);
	public List<Departamento> listarNombreDepartamentos(String nombre);
	public List<Departamento> listarPresupuestoDepartamentos(int presupuesto);
	public Departamento guardarDepartamento(Departamento departamento);
	public void eliminar(int id);
	
}
