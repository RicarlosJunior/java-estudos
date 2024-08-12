package br.com.bancodigital.modelo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {

    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(int codigo, String nome, String cpf, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    
}
