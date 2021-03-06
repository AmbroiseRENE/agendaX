package com.fr.Agenda.AgendaX.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Chief extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	protected String grade;

	@OneToOne
	@JoinColumn(name = "id_team")
	protected Team team;

	public Chief(String email, String pwd, String lastName, String firstName, String adress, int zipCode, String laboratory, String city, String phone, boolean admin) {
		super(email, pwd, lastName, firstName, adress, zipCode, laboratory, city, phone, admin);
	}
}
