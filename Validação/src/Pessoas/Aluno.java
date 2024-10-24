package Pessoas;

public class Aluno {

	public static void main(String[] args) {
	  
		int aluno1 = 0;
		
		int aluno2 = 0;
		
		int aluno3 = 0;
		
		int aluno4 = 5;
		
		int media = 4;
		
		int result = (aluno1 + aluno2 + aluno3 + aluno4) / media;
		
		if (result >= 7 && result <= 10) {
			System.out.println("Aprovado");
			
	} else if (result >= 5 && result <= 6) {
		System.out.println("Recuperação");
		
	} else {
		System.out.println("Resprovado");
	}
		
		
	}

}
