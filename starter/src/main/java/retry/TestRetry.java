package retry;

public class TestRetry {
	
	public void retry() {
		double randomNumber;
		for(int i=0;i<20;i++) {
			randomNumber=Math.random();
			if(randomNumber<=0.6) {
			System.out.println("ERROR. REINTENTANDO...");
			} else {
				i=20;
				System.out.println("TODO BIEN");
			}
		}
		System.out.println("LIMITE DE ERRORES ALCANZADO. PROCESO FALLIDO");
	}
	
}
