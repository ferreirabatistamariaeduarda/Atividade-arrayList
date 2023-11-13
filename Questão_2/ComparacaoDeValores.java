package Questão_2;

public class ComparacaoDeValores {

    public int totalPares(int[] valores) {
        int cont = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public int maiorValor(int[] valores) {
        int maior = valores[0];
        for (int valor : valores) {
            if (maior < valor) {
                maior = valor;
            }
        }
        return maior;
    }

    
}
