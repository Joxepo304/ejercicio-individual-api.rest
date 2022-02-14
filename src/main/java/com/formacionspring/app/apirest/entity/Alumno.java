package com.formacionspring.app.apirest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table( name="alumnos")
public class Alumno implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private String apellido;
	
	@Column(nullable=false,unique=true)
	private String dni;
	
	@Column(nullable=false,unique=true)
	private String email;
	private int telefono;
	
	private String direccion;
	private int cp;
	
	private String imagen;
	
	@ManyToOne(fetch=FetchType.LAZY) //Porque la relación que quiero es que me diga la región de cada cliente, por eso es ManyToOne porque es de muchos clientes relacionado con una cosa, la región.
	@JoinColumn(name="comunidad_id") //asi digo como quiero que me llame este atributo en la base de datos
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private ComunidadAutonoma region;
	
	
	
	
	
	public long getId() {
		return id;
	}





	public void setId(long id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellido() {
		return apellido;
	}





	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	public String getDni() {
		return dni;
	}





	public void setDni(String dni) {
		this.dni = dni;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public int getTelefono() {
		return telefono;
	}





	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}





	public int getCp() {
		return cp;
	}





	public void setCp(int cp) {
		this.cp = cp;
	}





	public String getImagen() {
		return imagen;
	}





	public void setImagen(String imagen) {
		this.imagen = imagen;
	}





	public ComunidadAutonoma getRegion() {
		return region;
	}





	public void setRegion(ComunidadAutonoma region) {
		this.region = region;
	}





	public String getDireccion() {
		return direccion;
	}





	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
