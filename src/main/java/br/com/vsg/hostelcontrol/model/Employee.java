package br.com.vsg.hostelcontrol.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

import br.com.vsg.hostelcontrol.enums.EmployeeTypeEnum;

@Document
public class Employee extends Person {

	private EmployeeTypeEnum type;
	private LocalDate startDate;

	public EmployeeTypeEnum getType() {
		return type;
	}

	public void setType( EmployeeTypeEnum type ) {
		this.type = type;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate( LocalDate startDate ) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Employee [type=" + type + ", startDate=" + startDate + "]";
	}

}
