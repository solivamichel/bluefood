package br.com.soliva.bluefood.domain.cliente;

import javax.persistence.Entity;

import br.com.soliva.bluefood.domain.usuario.Usuario;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
public class Cliente extends Usuario {
	private static final long serialVersionUID = 1L;

	private String cpf;
	
	private String cep;
}