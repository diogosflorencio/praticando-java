package ads;

public class GrupoAds {
	public static void main(String[] args) {
		
		// Criando novo objeto de referencia "davidRafael".
		Alunos davidRafael = new Alunos();
		
		/* Atribuindo valor String "David" ao atributo "nome" da classe aluno
		  a que o objeto de referencia "davidRafael" foi criado. */
		davidRafael.nome = "David";
		
		// Criando novo objeto de referencia "lucas".
		Alunos lucas = new Alunos();
		
		// Aqui, parece que o objeto lucas recebe o objeto davidRafael.
		// Mas, na vdd, a referencia "lucas" recebe e se torna o mesmo que a referencia david.
		// Os dois serão referencia para o mesmo objeto. (o primeiro, criado lá em cima).
		lucas = davidRafael;
		
		//Aqui, o atributo "nome" da classe em que o objeto de referencia "pedro" foi instanciado, recebe o valor "lucas".
		
		/* Mas, na vdd, o objeto em que o pedro foi instaciado não tem mais caminho,
		 "pedro" agora é referencia para o mesmo objeto que "davidRafael" */ 
		lucas.nome = "lucas";
		
		// o que sairá nesse print?
		System.out.println(davidRafael.nome);
		
	}
}
