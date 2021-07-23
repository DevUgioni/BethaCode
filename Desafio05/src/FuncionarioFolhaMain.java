public class FuncionarioFolhaMain {

    public static void main(String[] args){
        Funcionario funcionario01 = FuncionarioBuilder.novoFuncionario("ESTAGIARIO",1,"DAVI","123456789-01",1150.00);
        Funcionario funcionario02 = FuncionarioBuilder.novoFuncionario("ANALISTA",1,"JOÃO","123456789-02",3000.00);
        Funcionario funcionario03 = FuncionarioBuilder.novoFuncionario("ARQUITETO",1,"BRUNO","123456789-03",6200.00);
        Funcionario funcionario04 = FuncionarioBuilder.novoFuncionario("COORDENADOR",1,"FABIO","123456789-04",8900.00);

        System.out.println("Funcionário: "+funcionario01.getNome()+" salário bruto: R$"+funcionario01.getSalarioBruto());
        Folha folhaJulho01 = new Folha(1,funcionario01,"10/07/2021");
        folhaJulho01.calcular();
        System.out.println("Salário líquido do funcionário "+funcionario01.getNome()+": R$"+folhaJulho01.getSalarioLiquido());

        System.out.println("\nFuncionário: "+funcionario02.getNome()+" salário bruto: R$"+funcionario02.getSalarioBruto());
        Folha folhaJulho02 = new Folha(2,funcionario02,"10/07/2021");
        folhaJulho02.calcular();
        System.out.println("Salário líquido do funcionário "+funcionario02.getNome()+": R$"+folhaJulho02.getSalarioLiquido());

        System.out.println("\nFuncionário: "+funcionario03.getNome()+" salário bruto: R$"+funcionario03.getSalarioBruto());
        Folha folhaJulho03 = new Folha(3,funcionario03,"10/07/2021");
        folhaJulho03.calcular();
        System.out.println("Salário líquido do funcionário "+funcionario03.getNome()+": R$"+folhaJulho03.getSalarioLiquido());

        System.out.println("\nFuncionário: "+funcionario04.getNome()+" salário bruto: R$"+funcionario04.getSalarioBruto());
        Folha folhaJulho04 = new Folha(4,funcionario04,"10/07/2021");
        folhaJulho04.calcular();
        System.out.println("Salário líquido do funcionário "+funcionario04.getNome()+": R$"+folhaJulho04.getSalarioLiquido()+"\n");

        //teste com desconto e bonus
        Desconto[] descontos = new Desconto[2];
        descontos[0] = new Desconto(1,"FARMACIA",200.00);
        descontos[1] = new Desconto(2,"ONIBUS",180.00);

        Folha folhaAgosto01 = new Folha(5,funcionario01,"10/07/2021");
        folhaJulho04.calcular(descontos,150.00);
        System.out.println("Salário líquido do funcionário "+funcionario01.getNome()+": R$"+folhaJulho01.getSalarioLiquido());

    }
}
