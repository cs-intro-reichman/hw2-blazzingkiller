// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) { 
                String str = args[0];
                String name = str.toUpperCase();
                int N = Integer.parseInt(args[1]); 
                String specailletters = "AEFHILMNORSX"; 
                
                for(int i = 0; i < name.length(); ++i){
                        char letter = name.charAt(i);
                        if (specailletters.indexOf(name.charAt(i)) == -1){
                                System.out.println( "Give me a  " + letter + ":" + " " + letter + "!");  
                        } else {
                                System.out.println( "Give me an " + letter + ":" + " " + letter + "!");    
                        }
                }
                System.out.println( "What does that spell?");  
                for(int t = 0; t < N; ++t){
                        System.out.println(name + "!!!");
                }
         }
 }