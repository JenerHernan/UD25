/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import javax.websocket.ClientEndpoint;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Departamento;
import com.example.demo.dto.Empleado;
import com.example.demo.service.DepartamentoServiceImpl;
import com.example.demo.service.EmpleadoServiceImpl;
import com.example.demo.statics.Trabajos;

/**
 * @author Fenrir
 *
 */
@RestController
@RequestMapping("/api/")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	
	@GetMapping("departamentos")
	public List<Departamento> listarEmpleados(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@GetMapping("departamentos/{id}")
	public Departamento buscarEmpleado(@PathVariable(name="id") int id) {
		Departamento departamentoXID = new Departamento();
		departamentoXID = departamentoServiceImpl.buscarDepartamento(id);
		return departamentoXID;
	}
	
	@GetMapping("departamentos/nombre/{nombre}")
	public List<Departamento> buscarEmpleado(@PathVariable(name="nombre") String nombre) {
		return departamentoServiceImpl.listarNombreDepartamentos(nombre);
	}
	
	
	@GetMapping("departamentos/presupuesto/{presupuesto}")
	public List<Departamento> buscarEmpleadoTrabajo(@PathVariable(name="presupuesto") int presupuesto){
		return departamentoServiceImpl.listarPresupuestoDepartamentos(presupuesto);
	}
	
	@PostMapping("departamentos")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	@PutMapping("departamentos/{id}")
	public Departamento actualizarEmpleado(@PathVariable(name="id") int id, @RequestBody Departamento departamento) {
		Departamento departamentoSeleccionado = new Departamento();
		departamentoSeleccionado = departamentoServiceImpl.buscarDepartamento(id);
		departamentoSeleccionado.setNombre(departamento.getNombre());
		departamentoSeleccionado.setPresupuesto(departamento.getPresupuesto());
		return departamentoSeleccionado = departamentoServiceImpl.guardarDepartamento(departamentoSeleccionado);
		
	}

	
	@DeleteMapping("departamentos/{aux}")
	public void eliminarDepartamento(@PathVariable(name="aux")int aux) {
		System.out.println("Equisde---------------------------------------------S");
		departamentoServiceImpl.eliminar(aux);
	}
	

}
