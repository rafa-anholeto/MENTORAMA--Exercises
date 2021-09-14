package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente implements Comparable<Cliente> {
    private String name;
    private String cpf;
    private String cnpj;
    private String senha;
    private Integer compras;
    private Boolean status;
        private List<String> cliente = new ArrayList<>();


    public Cliente(String name,Boolean status, String senha, Integer compras){
        this.name = name;
        this.status = status;
        this.senha = senha;
        this.compras = compras;
    }


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

    public String getSenha(){
        return senha;
    }
    public int getCompras(){
        return  compras;
    }

    public void autentica(String senha){
        if(senha != this.senha){
            System.out.println("Não autenticado");
        }
        else{
            System.out.println("Autenticado");
        }
    }

    @Override
    public String toString() {
        return "Nome do cliente/empresa: "+ getName();
                /*+"\n"+ "CPF: "+ getCpf()
                +"\n"+ "CNPJ: "+ getCnpj();*/

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return compras == cliente.compras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(compras);
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.compras.compareTo(getCompras());
    }
}
