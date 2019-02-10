package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Client;
import br.com.vsg.hostelcontrol.repository.ClientRepository;
import br.com.vsg.hostelcontrol.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository repository;

	@Override
	public Client save(Client client) {
		return repository.save(client);
	}

	// TODO: throw not found exception instead null
	@Override
	public Client update(Client client) {
		if (get(client.getId()) != null)
			return repository.save(client);
		return null;
	}

	@Override
	public boolean delete(int id) {
		Client client = get(id);
		if (client != null) {
			repository.delete(client);
			return true;
		}
		return false;
	}

	@Override
	public Client get(int id) {
		Optional<Client> result = repository.findById(id);
		return result.isPresent() ? (Client) result.get() : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> nameLike(String name) {
		return new ArrayList<Client>((Collection<Client>) repository.findByNameIgnoreCaseContaining(name));
	}

	// TODO: implement pagination
	@Override
	public List<Client> getAll() {
		Collection<Client> clients = (Collection<Client>) repository.findAll();
		return new ArrayList<Client>(clients);
	}

}
