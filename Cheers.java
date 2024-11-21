// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) { 
                String word = args[0];
                String str = word.toUpperCase();
                //String strU
                int N = Integer.parseInt(args[1]); 
                int stringLength = str.length(); 
                String specailletters = "AEFHILMNORSX"; 
                
                for(int i = 0; i < stringLength; ++i){
                        if (specailletters.indexOf(str.charAt(i)) == -1){
                                System.out.println( "Give me a " + str.charAt(i) + ":" + " " + str.charAt(i) + "!");  
                        } else {
                                System.out.println( "Give me an " + str.charAt(i) + ":" + " " + str.charAt(i) + "!");    
                        }
                }
                System.out.println( "What does that spell?");  
                for(int t = 0; t < N; ++t){
                        System.out.println(str + "!!!");
                }
         }
 }