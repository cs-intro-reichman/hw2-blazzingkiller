public  class  TestRandom {
	public static void main(String[]  args) {
	 int N = Integer.parseInt(args[0]); 
	 double suma = 0;
	 double sumb = 0; 

	 for (int i = 0; i < N ; i++){
		if (Math.random() <= 0.5){
			suma += 1.0; 
		} else {
			sumb += 1.0;
		}
			
	 }
		System.out.println("> 0.5: " + (int) sumb + " times");
		System.out.println("<= 0.5: " + (int) suma + " times");
		if ((int) suma == 0 || (int) sumb == 0 || suma / sumb == Double.NEGATIVE_INFINITY || suma / sumb == Double.POSITIVE_INFINITY){
			 System.out.println("");
	 	} else {
			System.out.println("Ratio: " + (suma / sumb));
		}
		
	}

}