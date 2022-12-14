package pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.model.Reserva;
import pe.idat.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepository repository;
	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void guardar(Reserva reserva) {
		// TODO Auto-generated method stub
		repository.save(reserva);
	}

}
