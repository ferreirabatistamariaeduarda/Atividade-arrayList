public class EmpresaTeste {
    public static void main(String[] args) {
        
       Funcionario funcionario1 = new Funcionario();
       funcionario1.cadastrarFuncionario("Liz Emy", "12345678910", "28/06/2022", 889123457, 5000.0, "Diretora Executiva", "Rua Mariza Macedo Lima");
       Funcionario funcionario2 = new Funcionario();
       funcionario2.cadastrarFuncionario("Luan Esdras", "10987654321", "01/12/2019", 889765432, 5000.0, "Diretor Criativo", "Rua Mariza Macedo Lima");

       Empresa emp = new Empresa();
       emp.cadastrarEmpresa("Galinha Pintadinha TV", "1234567888/000-01", "Iguatu", "CE");
       emp.adiciona(funcionario2);
       emp.adiciona(funcionario1);

       System.out.println(emp.verificarFuncionario(funcionario2));
       emp.imprimirFuncionario();
    }
}
