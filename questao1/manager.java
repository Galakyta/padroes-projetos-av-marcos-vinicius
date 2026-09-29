package questao1;
public abstract class manager {
   public abstract credito criarCredito();
// q vai ser meu metodo fabrica proriamente dito
public final void processarContratacao() {
credito apolice = this.criarCredito(); //fiquei 20 minutos puto pq toda vez que eu copilava essa porra aq tava fora do processarContratacao
// e tava jogando NULL toda vez no final
System.out.println("Documentos pedidos para a contratação" + apolice.listagemDosDocumentosPedidos());
System.out.println("Calculo do juro: " + apolice.calculcarJuro());
System.out.println("resumindo: " + apolice.gerarResumo());
System.out.println();
} 
}
