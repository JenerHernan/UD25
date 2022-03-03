/**
 * 
 */
package com.example.demo.dto;

import javax.persistence.CascadeType;
/**
 * @author Fenrir
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.example.demo.statics.*;
@Entity
@Table(name="empleado")

public class Empleado {
	
	@Id
	@Column(name = "dni")
	private String DNI;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departamento", referencedColumnName = "codigo")
	private int departamento;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String apellido, int departamento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellido;
		this.departamento = departamento;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	
	
	
}
