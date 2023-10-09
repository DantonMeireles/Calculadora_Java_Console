import java.util.Scanner;
import Entidade.Calculadora;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in you
public class Main {
    static Scanner sc = new Scanner(System.in); // Interação do usuário com o programa
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número: "); // Solicitando ao usuário que digite o primeiro número
        double resultado=sc.nextDouble(); // Pegando o resultado que o usuário digitou, salvando na variavel 'resultado' atraves do scanner

        Calculadora a = new Calculadora(resultado); // Criando a calculadora e salvando o resultado
        System.out.println("Operação: ");
        System.out.println("(-) Subtrair, (+) Somar, (X) Multiplicar, (/) Dividiri");
        String op = sc.next(); // Pegando a operação que o usuário escolheu
        // eu poderia usar o 'toUpper', mas eu já coloquei lá no método

        while(op.equals("X") || op.equals("+") || op.equals("-") || op.equals("/") || op.equals("x")){ // Fazendo repetição, assim o programa só acaba quando o usuário digitar algo diferente das opções
            a.setOP(op); // Definindo a operação
            System.out.println("Digite um valor: ");
            double entrada=sc.nextDouble();
            a.setEntrada(entrada);// Pegando um valor
            a.operacao(); // fazendo a conta
            System.out.println("Resultado: " + a.getResultado()); // Exibindo resultado
            System.out.println("(-) Subtrair, (+) Somar, (X) Multiplicar, (/) Dividiri"); // repetição do ciclo
            op = sc.next();

        }System.out.println("Fim");

        }
}