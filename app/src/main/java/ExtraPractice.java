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


    public ValidationStatus passwordCharCount(String i) {
        return new ValidationStatus(true, "");
    
    }
    
}
