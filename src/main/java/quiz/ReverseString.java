package quiz;

public class ReverseString {
    public String reverse(String input) {
        String answer = "";
        for(int i = input.length() - 1; i >= 0; i--) {
        	answer = answer.concat(String.valueOf(input.charAt(i)));
        }
        return answer;
    }    
    
}