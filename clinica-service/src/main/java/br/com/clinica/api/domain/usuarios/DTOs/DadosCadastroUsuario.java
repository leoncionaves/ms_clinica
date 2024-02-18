package br.com.clinica.api.domain.usuarios.DTOs;

import br.com.clinica.api.domain.usuarios.perfil.Roles;
import br.com.clinica.api.domain.pessoa.PessoaDTO;

public record DadosCadastroUsuario(PessoaDTO pessoa,
                                   String usuario,
                                   String senha,
                                   Roles role) {
}
