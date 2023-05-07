import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) throws Exception {
    System.out.println("Tabuada Automática com while");
    Scanner fator = new Scanner(System.in);
    int userFator = fator.nextInt();
    var start = 1;
    while (start < 10){
        System.out.println(start + " X " + userFator + " : " + (start*userFator));
        start++;

    }
    System.out.println("Tabuada Automática com for");

    for(int comeco = 1; comeco < 10; comeco++){
        System.out.println(comeco + " X " + userFator + " : " + (comeco*userFator));

    }
    }
}
