package com.cibertec.LP2_T2_RonaldoJara.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Data
@Table(name = "tb_area")
public class Area {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="area_id")
	private int areaid;
	
	@Column(name="nombre_area")
	private String nombrearea;

	public int getAreaid() {
		return areaid;
	}

	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}

	public String getNombrearea() {
		return nombrearea;
	}

	public void setNombrearea(String nombrearea) {
		this.nombrearea = nombrearea;
	}

	public Area(int areaid, String nombrearea) {
		super();
		this.areaid = areaid;
		this.nombrearea = nombrearea;
	}

	public Area() {
		super();
	}
	
}
