public class CaixaEletronicoMain {
    public static void main(String[] args){
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        //cédulas disponíveis
        int quantidadeTotal = 0;
        //qtde de cedulas
        int valorReais = 163;
        //valor sacado

        //percorrer cedulas
        for(int i = 0; i < cedulas.length; i++)
        {
            //qtde cedulas para o valor cedulas[i]
            int quantidadeCedulas = valorReais/cedulas[i];

            //imprime qtde cedulas
            System.out.println("Quantidade de cedulas de "+cedulas[i]+
                    ": "+quantidadeCedulas);
            //resto divisao
            valorReais %= cedulas[i];
            //qtde total entregue ao cliente
            quantidadeTotal += quantidadeCedulas;
        }

        System.out.println("Quantidade total: "+quantidadeTotal);
    }
}
