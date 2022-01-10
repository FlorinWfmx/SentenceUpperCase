import java.util.Scanner;

public class SentenceUpperCase {
       public static void main(String [] args) {
            Scanner input = new Scanner (System.in);
            String s1 = input.nextLine ();
            System.out.println (sentenceCase(s1));
       }

       public static String sentenceCase (String s1){
//
//            variant 1, with method .charAt() which extracts the first character of the String, then it is converted to String;

//            String s2 = s1.toLowerCase();
//            char ch1 = s2.charAt(0);
//            String s3 = Character.valueOf(ch1).toString();
//            String s4 = s3.toUpperCase();
//            String s5 = s4 + s2.substring (1);
//            return s5;

//            variant 2, with first letter saved as a substring and capitalized; the rest of the letters becone another substring and they are concatenated;
//            iar restul literor alt substring, apoi concatenate

              String s2 = s1.toLowerCase();
              String s3 = s2.substring (0,1).toUpperCase();
              String s4 = s3 + s2.substring (1);
              return s4;
       }
}
