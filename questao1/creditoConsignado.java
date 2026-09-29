package questao1;
import java.util.Scanner;
public class creditoConsignado extends credito {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String listagemDosDocumentosPedidos() {
        return " Documentos exigidos: contracheque e status do beneficio";
        ///copiei e colei do exercicio pfvr n me mata
    }
    

    @Override
    public Double calculcarJuro() {
        // 8 pcrnt da  fipe no enunciado
        double juroTotal;

    System.out.println("digite o valor solicitado para o credito: ");

        double valorSolicitado = scanner.nextDouble();
        juroTotal = valorSolicitado * 1.08;
        System.out.println("valor com juros" + juroTotal);
        return juroTotal;
    }

     @Override
    public String gerarResumo() {
        return "resumo da operação, credito consignado creditado a 1.8% de juro em relacao ao valor solicitado. ";    
    }
}
