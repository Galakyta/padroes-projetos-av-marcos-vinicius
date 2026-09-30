package questao1;

import java.util.Scanner;

public class creditoMobile extends credito {
    //pensei em fazer um tipo de credito que seria voltado apenas pra compra de celular sla 
        Scanner scanner = new Scanner(System.in);

    @Override
    public String listagemDosDocumentosPedidos() {
        return " Documentos exigidios: identidade e comprovante de renda, e proibido dar pra estagiario";
        ///copiei e colei do exercicio pfvr n me mata
    }
    

    @Override
    public Double calculcarJuro() {
        // 8 pcrnt da  fipe no enunciado
        double juroTotal;

    System.out.println("digite o valor solicitado para o credito (que sera necessario se quier um S26 ultra): ");

        double valorSolicitado = scanner.nextDouble();
        juroTotal = valorSolicitado * 10.5; // sim 10% de juro
        System.out.println("valor com juros" + juroTotal);
        return juroTotal;
    }

     @Override
    public String gerarResumo() {
        return "resumo da operação, credito mobile voltado para compra de telefones, feito pra acabar com os sonhos das pessoas. com 10% ao dia pq sou do mal";    
    }


}
