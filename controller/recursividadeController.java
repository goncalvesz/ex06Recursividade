package controller;

public class recursividadeController {
	
	public recursividadeController(){
		
	}
	
	public int recSoma(int x, int vezes) {
		
		if (x > 0) { 
			if (vezes > 0) {
				return x + recSoma(x, vezes-1);
			}
			if (vezes < 0) {
				return -x + recSoma(x, vezes+1);
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}

	}

}
