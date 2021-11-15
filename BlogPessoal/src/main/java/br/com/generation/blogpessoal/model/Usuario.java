package br.com.generation.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank (message = "Deve inserir um nome.")
	@Size(min = 2, max = 100, message = "Tamanho mínimo de 2 e no máximo de 100.")
	private String nome;
	
	@NotBlank(message = "Deve inserir um usuário.")
	@Size(min = 5, max = 100, message = "Tamanho mínimo de 5 e no máximo de 100.")
	private String usuario;
	
	@NotBlank (message = "Deve inserir uma senha.")
	@Size(min = 2, message = "Tamanho mínimo de 2.")
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
