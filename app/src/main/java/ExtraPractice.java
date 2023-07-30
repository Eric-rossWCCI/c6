public class ExtraPractice {

    public String fizzBuzz(int i) {
        if(i % 3 == 0 && i % 5 == 0) {
            return"fizzbuzz";
        }else  if(i % 5 == 0) {
            return "buzz";
        } else if(i % 3 == 0 ) {
            return "fizz";
        }
        return "";
    }


    public ValidationStatus validatePassword(String i) {
        String message = "";
        int count = 0;
        if(i.length() < 8 ){
            //  new ValidationStatus(false, "Password must be at least 8 characters");
            message = message + "Password must be at least 8 characters";
        }
        char[]chars = i.toCharArray();
        for (char c: chars){
            if(Character.isDigit(c)){
                count++;
            }
        }
        if(count < 2){
            message = message + "The password must contain at least 2 numbers";
        }
        
        if(message.length() < 1){
            return new ValidationStatus(true, "That is a valid password.");
        } else{
         return new ValidationStatus(false, message);

        }

    }
    
}
