package pe.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.model.Reserva;
import pe.idat.service.ReservaService;

@Controller
@RequestMapping("/api/reserva/ef")
public class ReservaController {
	
	@Autowired
	private ReservaService service;
	
	@GetMapping("/listar")
    public @ResponseBody List<Reserva> listar(){
        return service.listar();
    }
	
	@PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody Reserva res) {
        service.guardar(res);
    }

}
