package br.com.vsg.hostelcontrol.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Invoice {

	@Id
	private int id;
	private List<Bill> bills = new ArrayList<>();
	private BigDecimal totalValue;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills( List<Bill> bills ) {
		this.bills = bills;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue( BigDecimal totalValue ) {
		this.totalValue = totalValue;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", totalValue=" + totalValue + "]";
	}

}
