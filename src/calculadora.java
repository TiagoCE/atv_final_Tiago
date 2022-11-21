public class calculadora {
    public double exponencial(double numeroA, double numeroB){
        return Math.pow(numeroA, numeroB);
    }

    public double raizQuadrada(double numeroA){
        if(numeroA < 0){
            System.out.println("Não existe raiz quadrada de número negativo no conjunto dos números reais");
            return 0.0;
        }
        return Math.sqrt(numeroA);
    }
}
