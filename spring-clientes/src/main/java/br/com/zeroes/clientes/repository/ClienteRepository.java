package br.com.zeroes.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.zeroes.clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
