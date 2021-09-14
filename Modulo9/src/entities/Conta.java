package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Conta {
    private Integer numero;
    private String banco;
    private Integer agencia;
    protected Double saldo;
    private List<String> contas = new ArrayList<>();
    Random aleatorio = new Random();

    public Conta(){

    }

    public Conta(Integer numero, String banco, Integer agencia, Double saldo) {
        this.numero = aleatorio.nextInt(1000);
        this.banco = "ABC";
        this.agencia = aleatorio.nextInt(300);
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return null;
    }

    public abstract Double sacar();

    public abstract Double depositar();

    public abstract Double transferir();


    public List<String> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", banco='" + banco + '\'' +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                '}';
    }

}