import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.util.Scanner;

public class word_spliter {
    public static void main(String[] args) throws Exception {

        System.out.println("");
        System.out.print("Enter a sentense or word : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(str);

        ArrayList<String> arr = new ArrayList<String>(100);

        while (matcher.find()) {
            arr.add(matcher.group());
        }

//        System.out.println("word split : "+arr);

        for (int i = 0; i < arr.toArray().length; i++)
        {
            System.out.println(arr.get(i).toString());
        }
    }
}
