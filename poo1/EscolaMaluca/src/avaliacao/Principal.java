package avaliacao;

public class Principal {
	public static void main(String[] args) {
		Disciplina aluno1 = new Disciplina(100,"Diogo",10,10,10);

		
		System.out.print("preciso de: " + aluno1.mediaFinal()+" tirei: "+ aluno1.media());
		
	}
}
