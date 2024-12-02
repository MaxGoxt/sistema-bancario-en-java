package querymysql.contas;

public class Conta {
    protected Integer id;
    protected Double saldo;
    protected String nome, sobreNome, senha, email, data;

    public Conta(Integer id, String nome, String sobreNome, Double saldo, String senha, String email, String data) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.saldo = saldo;
        this.senha = senha;
        this.email = email;
        this.data = data;
    }
    
    public boolean isEmpty() {
        return this.id == null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    

    @Override
    public String toString() {
        return "Nome: " + this.nome +
               "\nSobrenome: " + this.sobreNome +
               "\nSaldo: $" + this.saldo +
               "\nEmail: " + this.email +
               "\nCliente desde: "+ this.data;
    }    
}
