package questao1;

public class managerConsignado extends manager {
    @Override
    public credito criarCredito() {

        credito creditoGerado = new creditoConsignado();
        return creditoGerado;
    }
}
