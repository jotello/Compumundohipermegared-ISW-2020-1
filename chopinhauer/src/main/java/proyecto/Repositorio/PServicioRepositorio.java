package proyecto.Repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import proyecto.Entidad.PServicio;

@Repository
public interface PServicioRepositorio extends CrudRepository<PServicio,Long>{
	
	public Optional<PServicio> findById(Integer id);
	
	public void  deleteById(Integer id);
	//public List<Usuario> findAlByRol(String rol);
	
	//public Optional<Usuario> findByUsername(String username);

	//public Optional<PServicio> findByEmail(String email);
	
	
}
