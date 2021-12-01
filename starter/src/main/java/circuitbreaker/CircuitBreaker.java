package circuitbreaker;

public class CircuitBreaker {
	
	public void circuitBreaker() {
		
		double randomNumber;
		
		System.out.println("TODO BIEN. ESTADO CLOSED");
		System.out.println("-------------------------");
		for(int i = 0; i < 10; i++) {
			randomNumber= Math.random();
			if(randomNumber<=0.6) {
				System.out.println("ERROR. PASANDO A ESTADO OPEN");
				System.out.println("ESPERANDO...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("TIEMPO LIMITE ALCANZADO. PASANDO A ESTADO HALF-OPEN");
				System.out.println("PROBANDO DE NUEVO...");
				} else {
					i=10;
					System.out.println("SOLUCIONADO. VOLVIENDO A ESTADO CLOSED");
				}
			
		}
		System.out.println("MAXIMO DE INTENTOS ALCANZADO. ESTADO ABIERTO");
		
	}

}
