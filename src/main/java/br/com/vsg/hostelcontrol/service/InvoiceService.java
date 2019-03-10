package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.Invoice;

public interface InvoiceService {

	Invoice save(Invoice invoice);

	Invoice get(int id);

	Invoice update(Invoice invoice);

	void delete(int id);

	List<Invoice> getAll();

}
