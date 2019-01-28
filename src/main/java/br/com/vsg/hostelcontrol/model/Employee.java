package br.com.vsg.hostelcontrol.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.vsg.hostelcontrol.enums.EmployeeTypeEnum;

@Entity
public class Employee extends Person {

	@Enumerated( EnumType.STRING )
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
