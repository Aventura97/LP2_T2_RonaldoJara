package com.cibertec.LP2_T2_RonaldoJara.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.LP2_T2_RonaldoJara.models.Empleado;
import java.util.List;


public interface IEmpleadoRepository  extends JpaRepository<Empleado, String>{
	Empleado findByDniEmpleado(String dniEmpleado);
}
