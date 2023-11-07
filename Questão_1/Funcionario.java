public class Funcionario{
    String nome;
    String cpf;
    String data_de_nascimento;
    int telefone;
    double salario;
    String cargo;
    String endereço;

    public void cadastrarFuncionario(String nome,
    String cpf,
    String data_de_nascimento,
    int telefone,
    double salario,
    String cargo,
    String endereço){

        this.nome = nome;
        this.cpf = cpf;
        this.data_de_nascimento = data_de_nascimento;
        this.telefone = telefone;
        this.salario = salario;
        this.cargo = cargo;
        this.endereço = endereço;

    }
}