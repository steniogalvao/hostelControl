package br.com.vsg.hostelcontrol.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Bill {

	@Id
	@GeneratedValue
	private int id;

	@OneToMany
	private List<ItemBill> itens = new ArrayList<>();

	private BigDecimal value;

	@OneToOne
	private Client client;

	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime creationTime;

	@UpdateTimestamp
	private LocalDateTime updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ItemBill> getItens() {
		return itens;
	}

	public void setItens(List<ItemBill> itens) {
		this.itens = itens;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", itens=" + itens + ", value=" + value + ", creationTime=" + creationTime
				+ ", updateTime=" + updateTime + "]";
	}

}
