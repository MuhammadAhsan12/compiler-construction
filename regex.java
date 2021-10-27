import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class regex {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("1 : Is Int()");
        System.out.println("2 : Is Float()");
        System.out.println("3 : Is String()");
        System.out.println("4 : Is Char()");
        System.out.println("5 : Is Conditional()");
        System.out.println("6 : Is Identifier()");

        System.out.println("");
        System.out.print("Enter value or expression to check: ");
        String value = input.nextLine();
        System.out.println("");

        System.out.println("");
        System.out.print("Select a Number 1-6 for checking: ");
        int num = input.nextInt();
        System.out.println("");

        switch (num){
            case 1 :
                System.out.print("Is Int() : ");
                System.out.println(isInt(value));
                break;
            case 2 :
                System.out.print("Is Float() : ");
                System.out.println(isFloat(value));
                break;
            case 3 :
                System.out.print("Is String() : ");
                System.out.println(isString(value));
                break;
            case 4 :
                System.out.print("Is Char() : ");
                System.out.println(isChar(value));
                break;
            case 5 :
                System.out.print("Is Conditional() : ");
                System.out.println(isKeyword(value));
                break;
            case 6 :
                System.out.print("Is Identifier() : ");
                System.out.println(isIdentifier(value));
                break;
            default:
                System.out.println("Pleas enter a valid number of key 1-6");
        }
    }

    public static boolean isInt(String str){
        Pattern pattern = Pattern.compile("^[+|-]\\d+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        }
        return false;
    }

    public static boolean isFloat(String str){
        Pattern pattern = Pattern.compile("([+|-][0-9]*[.][0-9]+)|([0-9]*[.][0-9]+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        }
        return false;
    }

    public static boolean isString(String str){
        Pattern pattern = Pattern.compile("\\w+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        }
        return false;
    }

    public static boolean isChar(String str){
        Pattern pattern = Pattern.compile("^\\W*\\w\\W*$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        }
        return false;
    }

    public static boolean isKeyword(String str){
        String[] kw = new String[]{"if","else","elseif","switch","case","for","while","dowhile","int","float","char","string","public","static","void","main","private","protected","pakage","println","print","boolean","true","false","return","break","continue","throws","exception","new"};
        for(String x : kw){
            if(x.equals(str)){
                return true;
            }
        }
        return false;
    }

    public static boolean isIdentifier(String str){
        Pattern pattern = Pattern.compile("\\w+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        }
        return false;
    }
}
