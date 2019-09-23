package contabancaria;

public class ContaC {
    private String nome;
    private double saldo;


    public ContaC(String nome, double SaldoInicial) {
        this.nome = nome;
        if(SaldoInicial>0) this.saldo = SaldoInicial;

    }



    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if(valor >0) {
            saldo += valor;
        }
    }

}
