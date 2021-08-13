package entities;

public class ContaPoupanca extends Conta{
    private Integer diaAniversario;
    private Double taxaDeJuros;

    public ContaPoupanca(Integer numero, String banco, Integer agencia, Double saldo, Integer diaAniversario, Double taxaDeJuros) {
        super(numero, banco, agencia, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public Double getSaldo() {
        if(diaAniversario == 20){
            return this.saldo + (this.taxaDeJuros*5) * this.saldo;
        }
        return this.saldo + this.taxaDeJuros * this.saldo;
    }

    @Override
    public Double getSacar() {
        return null;
    }

    @Override
    public Double getDepositar() {
        return null;
    }

    @Override
    public String toString() {
        return "Conta Poupanca - BANCO ABC PAULISTA"
                +"\n "+"Saldo da conta: R$ " + String.format("%.2f",(this.saldo + this.taxaDeJuros * this.saldo))
                +"\n "+"Aniversario da conta: Dia " + diaAniversario
                +"\n "+"Data de verificação(hoje): "+ diaAniversario
                +"\n "+"Taxa de juros comum: "+ taxaDeJuros
                +"\n "+"Taxa de juros no dia do aniversário: "+ this.taxaDeJuros*5
                +"\n "+"Saldo da conta no aniversário: R$ " + String.format("%.2f", getSaldo());

    }

}
