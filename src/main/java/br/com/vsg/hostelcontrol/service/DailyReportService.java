package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.DailyReport;

public interface DailyReportService {

	DailyReport save(DailyReport dailyReport);

	DailyReport get(int id);

	DailyReport update(DailyReport dailyReport);

	void delete(int id);

	List<DailyReport> getAll();

}
