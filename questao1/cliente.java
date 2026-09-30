package questao1;
public class cliente {
    public static void main(String[] args) {
        manager geral1 = new managerConsignado();
        manager geral2 = new managerImobiliario();
        manager geral3 = new managerPessoal();

        credito credito1 = geral1.criarCredito();
        System.out.println("documentos que foram pedidos para a contratar" + credito1.listagemDosDocumentosPedidos());
        System.out.println("calculos dos juro: " + credito1.calculcarJuro());
        System.out.println("resumindamente: " + credito1.gerarResumo()); 

        /*credito credito2 = geral2.criarCredito();
        System.out.println("documentos que foram pedidos para a contratar" + credito2.listagemDosDocumentosPedidos());
        System.out.println("calculos dos juro: " + credito2.calculcarJuro());
        System.out.println("resumindamente: " + credito2.gerarResumo()); 

        credito credito3 = geral3.criarCredito();
        System.out.println("documentos que foram pedidos para a contratar" + credito3.listagemDosDocumentosPedidos());
        System.out.println("calculos dos juro: " + credito3.calculcarJuro());
        System.out.println("resumindamente: " + credito3.gerarResumo()); 
        */
    }
}
