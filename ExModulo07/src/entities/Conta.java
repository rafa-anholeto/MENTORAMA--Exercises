package entities;

public abstract class Conta {
    private Integer numero;
    private String banco;
    private Integer agencia;
    protected Double saldo;

    public Conta(Integer numero, String banco, Integer agencia, Double saldo) {
        this.numero = numero;
        this.banco = banco;
        this.agencia = agencia;
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

    public abstract Double getSaldo();

    public abstract Double getSacar() ;

    public abstract Double getDepositar() ;





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
