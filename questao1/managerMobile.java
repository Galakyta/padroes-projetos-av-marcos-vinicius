package questao1;

public class managerMobile extends manager {
   @Override
    public credito criarCredito() {
        credito creditoGerado = new creditoMobile();
        return creditoGerado;
    } 
}
