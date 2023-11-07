import java.util.ArrayList;

public class Empresa {
    String nomeEmpresa;
    String cnpj;
    String cidade;
    String uf;
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrarEmpresa(String nomeEmpresa,
    String cnpj,
    String cidade,
    String uf){
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.uf = uf;
    }

    public void adiciona(Funcionario f){
        this.funcionarios.add(f);
    }

    public boolean verificarFuncionario(Funcionario f){
        for(Funcionario x: this.funcionarios){
            if(x.equals(f)){
                return true;
            }
        }
        return false;
    }

    public void imprimirFuncionario(){
        for(Funcionario f: this.funcionarios){
            System.out.println("Nome: " + f.nome + " - Salário: " + f.salario);
        }
    }
}
