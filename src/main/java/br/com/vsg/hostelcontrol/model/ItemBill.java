package br.com.vsg.hostelcontrol.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class ItemBill {

	@GeneratedValue
	@Id
	private int id;

	@NotNull
	@OneToOne
	private ItemType itemType;

	@NotNull
	private int amount;

	@NotNull
	private BigDecimal unityPrice;

	private BigDecimal totalValue;

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

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BigDecimal getUnityPrice() {
		return unityPrice;
	}

	public void setUnityPrice(BigDecimal unityPrice) {
		this.unityPrice = unityPrice;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	@Override
	public String toString() {
		return "ItemBill [id=" + id + ", itemType=" + itemType + ", amount=" + amount + ", unityPrice=" + unityPrice
				+ ", totalValue=" + totalValue + ", creationTime=" + creationTime + ", updateTime=" + updateTime + "]";
	}

}
