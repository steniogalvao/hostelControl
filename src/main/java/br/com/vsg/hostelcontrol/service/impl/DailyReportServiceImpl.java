package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.DailyReport;
import br.com.vsg.hostelcontrol.repository.DailyReportRepository;
import br.com.vsg.hostelcontrol.service.DailyReportService;

@Service
public class DailyReportServiceImpl implements DailyReportService {

	@Autowired
	private DailyReportRepository repository;

	@Override
	public DailyReport save(DailyReport dailyReport) {
		if (dailyReport.getId() == 0) {
			return repository.save(dailyReport);
		} else {
			// TODO: Throw some exception
			return null;
		}
	}

	@Override
	public DailyReport get(int id) {
		Optional<DailyReport> opt = repository.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	public DailyReport update(DailyReport dailyReport) {
		if (repository.existsById(dailyReport.getId()))
			return repository.save(dailyReport);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<DailyReport> opt = repository.findById(id);
		if (opt.isPresent()) {
			repository.delete(opt.get());
		} else {
			// TODO throw not found exception
		}

	}

	@Override
	public List<DailyReport> getAll() {
		Collection<DailyReport> collection = (Collection<DailyReport>) repository.findAll();
		return new ArrayList<DailyReport>(collection);
	}

}
