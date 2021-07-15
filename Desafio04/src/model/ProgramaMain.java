package model;

public class ProgramaMain {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente(1,"Davi","Rua Teste","999109019","089.570.890-63","3.543.533","M",285.5,0.00);


        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Documento principal: " + cliente1.getDocumentoprincipal());
        System.out.println("Limite atual: " + cliente1.getLimiteCred());
        cliente1.aumentaLimite();
        System.out.println("Limite após aumento: " + cliente1.getLimiteCred());
        cliente1.reduzLimite();
        System.out.println("Limite após redução: " + cliente1.getLimiteCred());

        System.out.println();
        Funcionario funcionario1 = new Funcionario(1,"Jão","Rua teste 2","991099909","063.566.850-50","1.102.371","M",2800.00,2200.00);

        System.out.println("Funcionario: " + funcionario1.getNome());
        System.out.println("Documento principal: " + funcionario1.getDocumentoprincipal());
        System.out.println("Salário atual: " + funcionario1.getSalarioBruto());
        funcionario1.aplicaDissidio();
        System.out.println("Salário com dissídio: "+funcionario1.getSalarioBruto());

    }
}
