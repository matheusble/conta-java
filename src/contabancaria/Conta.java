package contabancaria;

import javax.swing.JOptionPane;

public class Conta {

    public static void main(String[] args) {


        String nome;
        double SaldoInicial;

        nome = JOptionPane.showInputDialog("Insira o nome do cliente: ");
        SaldoInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo inicial: "));
        ContaC MinhaConta = new ContaC(nome, SaldoInicial);

        int x;

        do {

            Object[] options = {"Ver saldo", "Depositar", "Sair"};

            x = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Op��es", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if(x == 0) {
                JOptionPane.showMessageDialog(null,"Seu saldo � de " + MinhaConta.getSaldo());

            }else if(x == 1){
                x = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja depositar: "));
                MinhaConta.depositar(x);
            }


        }while(x != 2);



        JOptionPane.showMessageDialog(null, "Willian Felipe de Almeida Moreira");

    }


}
