import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private Endereco endereco;
    private List<Conta>conta = new ArrayList<>();

    public Cliente(String nome, String cpf, String dataDeNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return cpf;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
