package br.com.caixa.api.domain.usuarios.DTOs;

import br.com.caixa.api.domain.usuarios.perfil.Roles;

public record UserRegisterDTO(String usuario, String senha, Roles role){
}
