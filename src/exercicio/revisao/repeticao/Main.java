package exercicio.revisao.repeticao;

/*
Altere o programa anterior(Exercicio4) permitindo ao usuário informar as populações e
as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */

public class Main {

    public static void main(String[] args) {
        double popA = 80000d;
        double popB = 200000d;
        double txA = 0.03;
        double txB = 0.015;
        double qtdA;
        double qtdB;

        qtdA = popA * txA;
        qtdB = popB * txB;

        double primeiroAnoA;
        double primeiroAnoB;

        primeiroAnoA = popA + qtdA;
        primeiroAnoB = popB + qtdB;

        System.out.println("A população A aumentou no primeiro ano para: " + primeiroAnoA);
        System.out.println("A população B aumentou no primeiro ano para: " + primeiroAnoB);

    }
}

