package br.com.caixa.api.infra.exception;

public class ValidarExcecoes extends RuntimeException {
    public ValidarExcecoes(String mensagem) {
        super(mensagem);
    }
}
