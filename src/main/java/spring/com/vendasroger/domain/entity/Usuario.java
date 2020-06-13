package spring.com.vendasroger.domain.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import spring.com.vendasroger.domain.resouce.BaseEntity;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario extends BaseEntity {

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;

	@Column(name = "roles")
	private String roles;
	
}