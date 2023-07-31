package avaliacao;

public class Disciplina {
	int matricula;
	String nome;
	double notaProva1;
	double notaProva2;
	double notaTrabalho;
	
	Disciplina(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho){
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}

	double media(){
		return (notaProva1*2.5 + notaProva2*2.5 + notaTrabalho*2)/7;
	}
	double mediaFinal() {
		if (media() < 7) {
			return (7-media());
		}
		return 0;
			
	}

	
	
}
