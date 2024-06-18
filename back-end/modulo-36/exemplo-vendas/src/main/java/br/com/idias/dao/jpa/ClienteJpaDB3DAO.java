package br.com.idias.dao.jpa;

import br.com.idias.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.idias.domain.jpa.ClienteJpa2;

/**
 * @author idias
 *
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
