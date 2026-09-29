package questao1;

import java.util.Scanner;

public class creditoImobiliario extends credito {
        Scanner scanner = new Scanner(System.in);

    @Override
    public String listagemDosDocumentosPedidos() {
        return " Documentos exigidos: matricula do imovel e comprovante de renda";
        ///copiei e colei do exercicio pfvr n me mata
    }
    

    @Override
    public Double calculcarJuro() {
        // 8 pcrnt da  fipe no enunciado
        double juroTotal;

    System.out.println("digite o valor solicitado para o credito: ");

        double valorSolicitado = scanner.nextDouble();
        juroTotal = valorSolicitado * 0.80;
        System.out.println("valor com juros" + juroTotal);
        return juroTotal;
    }

     @Override
    public String gerarResumo() {
        return "resumo da operação, credito consignado creditado a 0.8% de juro em cima do valor pedido. ";    
    }
}
