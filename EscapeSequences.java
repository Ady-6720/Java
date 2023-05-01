public class EscapeSequences {
    public static void main(String[] args){
        System.out.print("I always wanted to visit \"France\" as its so fascinating over there"); 
        //here by using \ before double quotes we get france in double quotes in output
        System.out.println("This is backslash \\");
        //always use double slash to print \ as compiler may detect it as escape sequence
        System.out.println("The photos are located in ~\\:Desktop\\Photos");
        //This is an example of using double slashes to print \
        System.out.println("This is an example of \n newline and now \t tab ");
        //This is \n for new line and \t is to get a tab between tow words
    }
    
}
