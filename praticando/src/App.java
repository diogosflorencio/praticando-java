public class App {
    public static void main(String[] args) throws Exception {
        int anoAtual = 2023;
        int anoNascimento = 2001;
        int idadeAtual = anoAtual - anoNascimento;
        float altura = 1.86f;
        int peso = 72;
        double imc = peso / (altura*altura);
        for(int repeticao = 0; repeticao < 30; repeticao++ ){
            System.out.print("-");
        }
        System.out.println("\nVocê nasceu em " + anoNascimento +"." + "\nEm " + anoAtual + " você tem " + idadeAtual + " anos!" + "\nSeu IMC é " + Math.round(imc));
        for(int repeticao = 0; repeticao < 30; repeticao++ ){
            System.out.print("-");
        }
    }
}
