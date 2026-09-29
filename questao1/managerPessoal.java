package questao1;

public class managerPessoal extends manager {
    @Override
    public credito criarCredito() {
        return new creditoPessoal();
    }
}
