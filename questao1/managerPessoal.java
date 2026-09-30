package questao1;

public class managerPessoal extends manager {
    @Override
    public credito criarCredito() {
        credito creditoGerado = new creditoPessoal();
        return creditoGerado;
    }
}
