package br.com.vsg.hostelcontrol.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
public abstract class Person {

	@Id
	@GeneratedValue
	private int id;
	@NotBlank
	private String name;
	@NotBlank
	private String surname;
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	private String passport;
	private String cpf;
	@NotBlank
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf( String cpf ) {
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
