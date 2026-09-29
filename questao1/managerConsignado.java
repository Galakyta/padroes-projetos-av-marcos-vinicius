package questao1;

public class managerConsignado extends manager {
    @Override
    public credito criarCredito() {
        return new creditoConsignado();
    }
}
