package br.com.financeiro.api.domain.usuarios.DTOs;

import br.com.financeiro.api.domain.usuarios.perfil.Roles;

public record UserRegisterDTO(String usuario, String senha, Roles role){
}
