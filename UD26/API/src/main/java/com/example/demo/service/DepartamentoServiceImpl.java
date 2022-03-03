/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;
import com.example.demo.dto.Empleado;

/**
 * @author Fenrir
 *
 */
@Service
public class DepartamentoServiceImpl implements IDepartamentoService {
	
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findAll();
	}
	
	@Override
	public Departamento buscarDepartamento(int id) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findByCodigo(id);
	}
	
	@Override
	public List<Departamento> listarNombreDepartamentos(String nombre) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findByNombre(nombre);
	}
	
	@Override
	public List<Departamento> listarPresupuestoDepartamentos(int presupuesto) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findByPresupuestoGreaterThanEqual(presupuesto);
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	@Transactional
	public void eliminar(int aux) {
		// TODO Auto-generated method stub
		iDepartamentoDAO.removeByCodigo(aux);
	}
}
