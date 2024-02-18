package br.com.caixa.api.domain.usuarios.DTOs;

import br.com.caixa.api.domain.pessoa.PessoaDTO;
import br.com.caixa.api.domain.usuarios.perfil.Roles;

public record DadosCadastroUsuario(PessoaDTO pessoa,
                                   String usuario,
                                   String senha,
                                   Roles role) {
}
