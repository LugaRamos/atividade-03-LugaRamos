public class ContaCorrente{

    private int numeroDaConta;
    private int agencia;
    private String documento;
    private String senha;
    private boolean ativa;
    private double saldo;
    private Pessoa pessoa;

    public ContaCorrente(int numeroDaConta, int agencia, String documento, String senha, boolean ativa, double saldo){

        this.setNumeroDaConta(numeroDaConta);
        this.setAgencia(agencia);
        this.setDocumento(documento);
        this.setSenha(senha);
        this.setAtiva(ativa);
        this.saldo = saldo;
    }

    public ContaCorrente(int numeroDaConta, int agencia, String documento, String senha, boolean ativa){
        
        this(numeroDaConta, agencia, documento, senha, ativa, 0.0);

    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void saque(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saque com Sucesso!");
       }else{
            System.out.println("Sem Dinheiro, Não podera mais efetuar o saque");
       }
    }

    public String toString() {
        
        return "ContaCorrente [agencia=" + agencia + ", ativa=" + ativa + ", documento=" + documento
                + ", numeroDaConta=" + numeroDaConta + ", saldo=" + saldo + ", senha=" + senha + "]";
    }
    

}