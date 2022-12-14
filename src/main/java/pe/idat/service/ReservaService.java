package pe.idat.service;

import java.util.List;

import pe.idat.model.Reserva;

public interface ReservaService {
	
	List<Reserva> listar();
	void guardar(Reserva reserva);
}
