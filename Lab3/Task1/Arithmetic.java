public class Arithmetic {
    public static void main(String[] args) {

        int val1=Integer.parseInt(args[0]);   
        int val2=Integer.parseInt(args[1]);
        char op=args[2].charAt(0);

        double result=0;
        boolean isWrongInput=false;

        switch(op){
            case '+':
            result=val1+val2;
            break;
            case '-':
            result=val1-val2;
            break;
            case '*':
            result=val1*val2;
            break;
            case '/':
            result=val1/val2;
            break;
            default:
            result=0;isWrongInput=true;
        }
        if(!isWrongInput){
            System.out.println(""+val1+op+val2+"= "+result);
        }
        else System.out.println("Wrong Input!");
    }
        

}
