package entities;

public class ContaSalario extends Conta implements Tributavel{
    private int limiteSaque;
    private Double saque;
    private Double deposito;
    private Double transferir;


    public ContaSalario(){
        super();
    }

    public ContaSalario(Integer numero, String banco, Integer agencia, Double saldo, Double saque) {
        super(numero, banco, agencia, saldo);
        this.saque = saque;
    }
    public ContaSalario(Double deposito, Double saque, Double transferir){
        this.deposito = deposito;
        this.saque = saque;
        this.transferir = transferir;
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    @Override
    public Double getSaldo() {
        this.saldo = 1000.00;
        return this.saldo + this.deposito;
    }

    @Override
    public Double sacar() {
        if (getLimiteSaque() >= 2) {
            System.out.println("" +
                    "\n Você chegou no limite de saques de sua conta salário." +
                    "\n");
        } else if(saque > getSaldo()){
            System.out.println("Erro, saldo insuficiente, tente novamente.");
            System.exit(0);
        } else {
            limiteSaque++;
        }
        return saque;
    }

    @Override
    public Double depositar() {
        limiteSaque++;
        return deposito;
    }

    @Override
    public Double transferir() {
        return transferir;
    }


    @Override
    public String toString() {
        return "Conta Salario - BANCO ABC PAULISTA "
                +"\n "+"Valor sacado R$ "+ String.format("%.2f",sacar())
                +"\n "+ "Saldo restante R$ " + String.format("%.2f",getSaldo() - saque)
                +"\n "+ "Limite de saques restantes: "+ getLimiteSaque() ;
    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}