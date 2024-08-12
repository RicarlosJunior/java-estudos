package br.com.bancodigital.modelo;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Banco {

    private String nomeInstituicao;
    private String cnpj;
    private String endereco;
    private List<Conta> contas;

    public Banco(String nomeInstituicao, String cnpj, String endereco) {
        this.nomeInstituicao = nomeInstituicao;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

}
