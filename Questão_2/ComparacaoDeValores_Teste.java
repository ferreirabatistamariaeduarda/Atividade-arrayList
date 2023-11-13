package Questão_2;

public class ComparacaoDeValores_Teste {
    public static void main(String[] args) {
        ComparacaoDeValores cv = new ComparacaoDeValores();
        int [] v= new int[10];
        for(int i = 0; i < v.length; i++){
            v[i]=(i*i)+1;
            v[i] = i + 1;

            
        }
        int resultado = cv.totalPares(v);
        System.out.println(resultado);

        
        int maiorResultado = cv.maiorValor(v);
        System.out.println("O maior valor é: " + maiorResultado);
        }
    }

