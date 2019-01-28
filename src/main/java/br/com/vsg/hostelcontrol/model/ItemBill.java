package br.com.vsg.hostelcontrol.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ItemBill {

	@GeneratedValue
	@Id
	private int id;
	@OneToOne
	private Item item;
	private int amount;
	private BigDecimal totalValue;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem( Item item ) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount( int amount ) {
		this.amount = amount;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue( BigDecimal totalValue ) {
		this.totalValue = totalValue;
	}

	@Override
	public String toString() {
		return "ItemBill [id=" + id + ", amount=" + amount + ", totalValue=" + totalValue + "]";
	}

}
