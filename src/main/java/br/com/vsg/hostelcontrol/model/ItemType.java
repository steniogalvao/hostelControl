package br.com.vsg.hostelcontrol.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ItemType {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	@NotEmpty
	private String name;

	private String description;

	@NotEmpty
	private String brand;

	@JsonIgnoreProperties(value = "itemType")
	@OneToMany(mappedBy = "itemType", targetEntity = Item.class)
	private List<Item> listItem = new ArrayList<>();

	private int amount;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public void setListItem(List<Item> listItem) {
		this.listItem = listItem;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemType [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand
				+ ", listItem=" + listItem + ", amount=" + amount + ", creationTime=" + creationTime + ", updateTime="
				+ updateTime + "]";
	}

}
