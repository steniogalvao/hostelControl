package br.com.vsg.hostelcontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.vsg.hostelcontrol.model.DailyReport;
import br.com.vsg.hostelcontrol.service.DailyReportService;

@Controller
public class DailyReportController {

	@Autowired
	private DailyReportService service;

	@PostMapping(value = "/dailyReport")
	@ResponseBody
	public DailyReport post(@RequestBody DailyReport dailyReport) {
		return service.save(dailyReport);
	}

	@GetMapping(value = "/dailyReport/{id}")
	@ResponseBody
	public DailyReport get(@PathVariable int id) {
		return service.get(id);
	}

	@PutMapping(value = "/dailyReport")
	@ResponseBody
	public DailyReport put(@RequestBody DailyReport dailyReport) {
		return service.update(dailyReport);
	}

	@DeleteMapping(value = "/dailyReport/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

}
