package entities;



public class ContaSalario extends Conta{
    private int limiteSaque;
    private Double saque;

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
        return this.saldo - this.saque;
    }

    @Override
    public Double sacar() {
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
    public Double getDepositar() {
        return null;
    }

    @Override
    public String toString() {
        return "Conta Salario - BANCO ABC PAULISTA "
                +"\n "+ "Saldo total da conta R$"+ this.saldo
                +"\n "+"Valor sacado R$ "+ String.format("%.2f",saque) +" e seu novo saldo é de R$ "+ String.format("%.2f",sacar())
                +"\n "+ "Saldo restante R$ " + String.format("%.2f",getSaldo())
                +"\n "+ "Limite de saques restantes: "+ getLimiteSaque();

    }

}
