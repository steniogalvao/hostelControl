package br.com.vsg.hostelcontrol.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Bill {

	@Id
	@GeneratedValue
	private int id;
	private LocalDateTime time;
	@OneToMany
	private List<ItemBill> itens = new ArrayList<>();
	private BigDecimal value;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime( LocalDateTime time ) {
		this.time = time;
	}

	public List<ItemBill> getItens() {
		return itens;
	}

	public void setItens( List<ItemBill> itens ) {
		this.itens = itens;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue( BigDecimal value ) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", time=" + time + ", itens=" + itens + ", value=" + value + "]";
	}

}
