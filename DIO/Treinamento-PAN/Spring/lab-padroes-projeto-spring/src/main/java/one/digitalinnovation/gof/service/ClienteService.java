package one.digitalinnovation.gof.service;

import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;

/***
 * 
 * @author alifi
 *
 */

@Service
public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long Id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
	
	

}
