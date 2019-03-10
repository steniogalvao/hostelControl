package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Invoice;
import br.com.vsg.hostelcontrol.repository.InvoiceRepository;
import br.com.vsg.hostelcontrol.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepository repository;

	@Override
	public Invoice save(Invoice invoice) {
		return repository.save(invoice);
	}

	// TODO throw not found exception
	@Override
	public Invoice get(int id) {
		Optional<Invoice> opt = repository.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	// TODO throw not found exception
	@Override
	public Invoice update(Invoice invoice) {
		if (repository.existsById(invoice.getId()))
			return repository.save(invoice);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<Invoice> opt = repository.findById(id);
		if (opt.isPresent())
			repository.delete(opt.get());

	}

	@Override
	public List<Invoice> getAll() {
		Collection<Invoice> collection = (Collection<Invoice>) repository.findAll();
		return new ArrayList<Invoice>(collection);
	}

}
