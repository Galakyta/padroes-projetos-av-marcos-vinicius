package questao1;

public class managerImobiliario extends manager {
    @Override
    public credito criarCredito() {
        credito creditoGerado = new creditoImobiliario();
        return creditoGerado;
    }
}
