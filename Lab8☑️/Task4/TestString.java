public class TestString{
    public static void main(String[] args){

        if(args.length<2){
            System.out.println("Error!! second input cannot be an empty string!!");
            return;
        }

        String word=args[0];
        char ch=args[1].charAt(0) ;

        int count=0;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                count++;
            }

        }

        System.out.println("There are "+ count+" of "+ ch+" appears in the word "+word);

    }
}