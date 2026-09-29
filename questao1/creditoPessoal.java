package questao1;

import java.util.Scanner;

public class creditoPessoal extends credito {
        Scanner scanner = new Scanner(System.in);

    @Override
    public String listagemDosDocumentosPedidos() {
        return " Documentos exigidiosÇ identidade e comprovante de renda";
        ///copiei e colei do exercicio pfvr n me mata
    }
    

    @Override
    public Double calculcarJuro() {
        // 8 pcrnt da  fipe no enunciado
        double juroTotal;

    System.out.println("digite o valor solicitado para o credito: ");

        double valorSolicitado = scanner.nextDouble();
        juroTotal = valorSolicitado * 3.5;
        System.out.println("valor com juros" + juroTotal);
        return juroTotal;
    }

     @Override
    public String gerarResumo() {
        return "resumo da operação, credito pessoal creditado a 3.5% de juro. ";    
    }
}