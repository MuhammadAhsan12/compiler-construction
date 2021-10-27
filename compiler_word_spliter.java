import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class compiler_word_spliter {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int line = 0;
        System.out.println("Please enter some Strings: ");

        while (true){
            String s = "";
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("/")) {
                break;
            }

            s += input ;
            line = line + 1;
            String[] currencies = s.split(" ");

            for (int i = 0; i < currencies.length; i++)
            {
//                System.out.println(currencies[i] + " " + line);

                if (isKeyword(currencies[i]) == true) {
                    System.out.println("[" + currencies[i] + " , keyword" + " , " + line + "]");
                }
            }
        }
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
}

