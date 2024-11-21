public class Collatz {
    public static void main(String args[]) {
        int limit = Integer.parseInt(args[0]); 
        String a = args[1];
       
        if (a.indexOf('c') == 0) {  
            System.out.println("Every one of the first " + limit + " hailstone sequences reached 1."); 
        } else {
            for (int i = 1; i <= limit; i++) {
                System.out.print(i + " ");
                int count = 1;  
                int n = i;
                
                boolean first = (i == 1);
                while (n > 1 || (first && count <= 3)) { 
                    if (n % 2 == 0) {
                        n = n / 2;  
                    } else {
                        n = 3 * n + 1; 
                    }
                    System.out.print(n + " ");  
                    count++;
                    if (n == 1 && first) { 
                        break;
                    }
                }

                System.out.println("(" + count + ")"); 
            }    
        }
    }
}
