public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double pi = Math.PI; 
		double sum = 0.0;
		
		System.out.println("pi according to Java: " + pi);

		for (int i = 0; i < N ; i++){
			if (i % 2 == 0){
				sum += (1.0/(2 * i + 1));
			} else {
				sum -= (1.0/((2 * i + 1)));
			}
		}
		double piApprox = sum * 4;

	System.out.println("pi, approximated:: " + piApprox);


	}
}
