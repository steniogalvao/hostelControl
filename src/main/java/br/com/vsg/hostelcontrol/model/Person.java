package br.com.vsg.hostelcontrol.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public abstract class Person {

	@Id
	private int id;
	private String name;
	private String surname;
	private Address address;
	private String passport;
	private int cpf;
	private String email;
	private LocalDate birthday;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname( String surname ) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress( Address address ) {
		this.address = address;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport( String passport ) {
		this.passport = passport;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf( int cpf ) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday( LocalDate birthday ) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", address=" + address + ", passport=" + passport + ", cpf=" + cpf + ", email=" + email + ", birthday=" + birthday + "]";
	}

}
