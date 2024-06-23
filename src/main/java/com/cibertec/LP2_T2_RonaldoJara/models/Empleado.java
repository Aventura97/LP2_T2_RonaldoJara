package com.cibertec.LP2_T2_RonaldoJara.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//@Data
@Table(name = "tb_empleado")
public class Empleado {

	@Id
    @Column(name = "dni_empleado", length = 8)
    private String dniEmpleado;

    @Column(name = "nombre_empleado", length = 45, nullable = false)
    private String nombreEmpleado;

    @Column(name = "apellido_empleado", length = 45, nullable = false)
    private String apellidoEmpleado;

    @Column(name = "fecha_nacimiento", nullable = false)
    private java.sql.Date fechaNacimiento;

    @Column(name = "direccion", length = 45)
    private String direccion;

    @Column(name = "correo", length = 45)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private Area areas;

	public String getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public java.sql.Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Area getAreas() {
		return areas;
	}

	public void setAreas(Area areas) {
		this.areas = areas;
	}

	public Empleado(String dniEmpleado, String nombreEmpleado, String apellidoEmpleado, Date fechaNacimiento,
			String direccion, String correo, Area areas) {
		super();
		this.dniEmpleado = dniEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.correo = correo;
		this.areas = areas;
	}

	public Empleado() {
		super();
	}
	
	
	

}
