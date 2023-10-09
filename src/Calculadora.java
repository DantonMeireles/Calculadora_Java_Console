package Entidade;
public class Calculadora {
    private double resultado = 0; // Valor inicial de calculadora
    private double entrada = 0; // Entrada do usuário
    private String op = ""; // Operação

    public Calculadora(double resultado){ // Método construtor
        this.resultado=resultado;
    }

    // métodos da calculadora
    public void soma(){
        resultado = resultado+entrada;
    }
    public void subtracao(){
        resultado = resultado - entrada;
    }
    public void multiplicacao(){
        resultado = resultado * entrada;
    }
    public void divisao(){
        resultado = resultado / entrada;
    }

    public void operacao(){ // Operações disponíveis para o usuário

        // Como o scanner é uma string, não usar o ' == ' para comparar, melhor usar o equals

        if(op.equals("X") || op.equals("x") /*|| op.equals("*")*/){
            multiplicacao();
        }
        else if(op.equals("/")){
            divisao();
        } else if (op.equals("+")) {
            soma();
        } else if (op.equals("-")) {
            subtracao();
        }
    }



    // Métodos getters e setters
    public double getResultado(){
        return resultado;
    }
    public void setResultado(double resultado){
        this.resultado = resultado;
    }
    public double getEntrada(){
        return entrada;
    }
    public void setEntrada(double entrada){
        this.entrada = entrada;
    }
    public String getOP(){
        return op;
    }
    public void setOP(String op){
        this.op = op;
    }
}
