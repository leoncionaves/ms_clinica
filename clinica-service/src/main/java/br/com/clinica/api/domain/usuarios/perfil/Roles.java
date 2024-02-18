package br.com.clinica.api.domain.usuarios.perfil;

public enum Roles {
    ADMIN("admin"),
    USER("user");

    private String role;

    Roles(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
