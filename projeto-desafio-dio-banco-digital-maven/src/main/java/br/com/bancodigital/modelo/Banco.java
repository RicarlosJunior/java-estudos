package br.com.bancodigital.modelo;

import java.util.ArrayList;
import java.util.List;


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

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getCnpj() {
        return cnpj;
    }

}
