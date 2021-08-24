package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String name;
    private String cpf;
    private String cnpj;
    private List<String> cliente = new ArrayList<>();



    public Cliente(String name, String cpf, String cnpj) {
        this.name = name;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }


    public String getName() {
        return name;
    }


    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<String> getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Nome do cliente/empresa: "+ getName()
                +"\n"+ "CPF: "+ getCpf()
                +"\n"+ "CNPJ: "+ getCnpj();

    }
}
