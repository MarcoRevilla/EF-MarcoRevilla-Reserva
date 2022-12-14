package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.model.ReservaDetalle;

@Repository
public interface DetalleReservaRepository extends JpaRepository<ReservaDetalle, Integer>{

}
