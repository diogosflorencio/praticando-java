import java.util.Scanner;
public class calculadora {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        numero n1 = new numero(0);
        numero n2 = new numero(0);
        numero res = new numero(0);
    
        String opc = "S";
        while (opc.equals("S") || opc.equals("s")){
            System.out.printf("Digite o valor 1: ");
            n1.setValor(input.nextInt());
            System.out.printf("Digite o valor 2: ");
            n2.setValor(input.nextInt());
    
            res.setValor(n1.getValor() + n2.getValor());
            
            System.out.printf("%nA soma de %d com %d é igual a %d %n", n1.getValor(), n2.getValor(), res.getValor());
            System.out.println("Deseja somar outro valor? [S - sim]");
            opc = input.next();
        }


    }

}
