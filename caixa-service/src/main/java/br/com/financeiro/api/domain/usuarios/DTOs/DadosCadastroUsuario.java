package br.com.financeiro.api.domain.usuarios.DTOs;

import br.com.financeiro.api.domain.pessoa.PessoaDTO;
import br.com.financeiro.api.domain.usuarios.perfil.Roles;

public record DadosCadastroUsuario(PessoaDTO pessoa,
                                   String usuario,
                                   String senha,
                                   Roles role) {
}
