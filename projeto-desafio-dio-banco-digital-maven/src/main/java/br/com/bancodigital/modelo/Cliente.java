package br.com.bancodigital.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
public class Cliente {

    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;

    
}
