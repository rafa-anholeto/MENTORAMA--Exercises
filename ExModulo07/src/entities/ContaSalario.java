package entities;

import java.util.List;

public class ContaSalario extends Conta{
    private int limiteSaque;
    private Double saque;
    private List<Double> sacar;

    public ContaSalario(Integer numero, String banco, Integer agencia, Double saldo, Double saque) {
        super(numero, banco, agencia, saldo);
        this.saque = saque;
        this.limiteSaque = 2;
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }


    @Override
    public Double getSaldo() {
        if (getLimiteSaque() <= 0) {

            System.out.println("" +
                    "\n Você chegou no limite de saques de sua conta salário." +
                    "\n");
        } else if(saque > saldo){
            System.out.println("Erro, saldo insuficiente, tente novamente.");
            System.exit(0);

        } else {
            limiteSaque--;


        }
        return this.saldo - this.saque;
    }

    @Override
    public Double getSacar() {
        return this.saldo - this.saque;
    }


    @Override
    public Double getDepositar() {
        return null;
    }

    @Override
    public String toString() {
        return "Conta Salario - BANCO ABC PAULISTA "
                +"\n "+"Valor sacado R$ "+ String.format("%.2f",saque) +" e seu novo saldo é de R$ "+ String.format("%.2f",getSaldo())
                +"\n "+ "Saldo restante: " + String.format("%.2f",getSacar())
                +"\n "+ "Limite de saques restantes: "+ getLimiteSaque();

    }

}
