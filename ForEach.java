import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random rand = new Random();
		
		for(int i = 0; i<notas.length; i++) {
			
			notas[i] = rand.nextInt(10);
			
		}
		
		for(int i=0; i<notas.length; i++) {
			//int nota = notas[i]
			//System.out.println(nota);
			System.out.println(notas[i]);
		}
		//não da pra setar valor dentro, apenas output
		System.out.println("usando for each");
		for(int nota : notas) {
			System.out.println(nota);
		}
	}

}

