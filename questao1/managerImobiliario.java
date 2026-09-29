package questao1;

public class managerImobiliario extends manager {
    @Override
    public credito criarCredito() {
        return new creditoImobiliario();
    }
}
