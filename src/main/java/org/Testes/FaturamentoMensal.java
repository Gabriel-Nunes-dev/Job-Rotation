//Desafio #3

package org.Testes;

public class FaturamentoMensal {
//Números utilizados do anexo de arquivo de apoio
    public static void main(String[] args) {
        double[] faturamentoDiario = {
                22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722,
                0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826,
                43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};


        double soma = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > 0) {
                soma += faturamentoDiario[i];
                diasComFaturamento++;
            }
        }

        double mediaMensal = soma / diasComFaturamento;

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > 0) {
                if (faturamentoDiario[i] < menorFaturamento) {
                    menorFaturamento = faturamentoDiario[i];
                }

                if (faturamentoDiario[i] > maiorFaturamento) {
                    maiorFaturamento = faturamentoDiario[i];
                }

                if (faturamentoDiario[i] > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média mensal: " + diasAcimaDaMedia);

    }

}