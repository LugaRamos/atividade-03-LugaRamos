public class Banco {

    private String nome;
    private String telefone;
    private String cnpj;
    private Pessoa[] pessoas;
    private ContaCorrente[] contaCorrentes;
    private int qtdePessoas;
    private int qtdeContas;
    
    
    public Banco(String nome, String telefone, String cnpj) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setCnpj(cnpj);
        setPessoas(new Pessoa[5]);
        qtdePessoas = 0;
        setContaCorrentes(new ContaCorrente[5]);
        qtdeContas = 0;
    }

    public void cadastrarPessoas(Pessoa pessoa) {
        this.pessoas[qtdePessoas] = pessoa;
        qtdePessoas += 1;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void cadastrarConta(ContaCorrente conta){
        this.contaCorrentes[qtdeContas] = conta;
        qtdeContas += 1;
    }

    public ContaCorrente[] getContaCorrentes() {
        return contaCorrentes;
    }

    public void setContaCorrentes(ContaCorrente[] contaCorrentes) {
        this.contaCorrentes = contaCorrentes;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
}
