package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds2020log0.modelo.Cliente;

@Repository("clienteRepositorio")


public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
