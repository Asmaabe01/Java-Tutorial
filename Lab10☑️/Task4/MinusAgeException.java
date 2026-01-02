package Task4;

public class MinusAgeException extends Exception {
    //create new exception 

    public MinusAgeException(String message){
        super(message);//store the message from person class
    }
}
