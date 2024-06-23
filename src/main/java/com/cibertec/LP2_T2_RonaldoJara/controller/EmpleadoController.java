package com.cibertec.LP2_T2_RonaldoJara.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.LP2_T2_RonaldoJara.models.Empleado;
import com.cibertec.LP2_T2_RonaldoJara.repository.IAreaRepository;
import com.cibertec.LP2_T2_RonaldoJara.repository.IEmpleadoRepository;

@Controller
public class EmpleadoController {

	
	@Autowired
	private IEmpleadoRepository emprepo;
	
	@Autowired
	private IAreaRepository arerepo;
	
	@GetMapping("/")
	public String listaempleado(Model model) {
		model.addAttribute("empleado",new Empleado());
		model.addAttribute("lstempleado", emprepo.findAll());
		model.addAttribute("lstmarca",arerepo.findAll());
		return "ListadoEmpleado";
	}
	
	
	@GetMapping("/agregar-empleado")
    public String mostrarFormularioAgregarEmpleado(Model model) {
		model.addAttribute("area",arerepo.findAll());
        model.addAttribute("empleado", new Empleado()); 

        return "agregarEmpleado"; 
    }
	
	 @GetMapping("/eliminar/{dni}")
	    public String eliminarEmpleado(@PathVariable("dni") String dni, RedirectAttributes redirectAttributes) {
	        emprepo.deleteById(dni);
	        return "redirect:/";
	    }
	 
	 
	 @PostMapping("/guardarEmpleado")
	    public String guardarEmpleado(@ModelAttribute Empleado empleado, Model model) {
	        emprepo.save(empleado);
	        return "redirect:/";
	    }
	 
	 
	 @GetMapping("/editar/{dni}")
	 public String mostrarFormularioEditarEmpleado(@PathVariable("dni") String dni, Model model) {
	     Empleado empleado = emprepo.findById(dni).orElse(null);
	     model.addAttribute("empleado", empleado);
	     model.addAttribute("area", arerepo.findAll());
	     return "editarEmpleado";
	 }
}
