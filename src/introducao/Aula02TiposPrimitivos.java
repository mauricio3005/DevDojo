package introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        int numeroInteiro = 1;
        double numeroQuebradoGrande=1.5;
        float numeroGrande= 1.3F;
        byte numerinhoZinho = 127;
        char letrinha = 'a';
        short numerinho= 32767;
        long numeroInteiroGrande = 10000000000000L;
        boolean falsoOuVerdadeiro = false;
        falsoOuVerdadeiro=true;
        int idade = (int)10000L;
        //Isso é casting, forçada a entrada do valor.
        //Se passar do tamanho, elev ai até o limite.
        String nome = "Um graaande texto";
        //String é um objeto, e não um tipo primitivo
        var sd = 11;
    }
}
