import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BdjExample {

    public static void main(String[] args) {
//to check pattern if two string might be an input
        Pattern pattern = Pattern.compile("samuel@gmail");
        Matcher matcher = pattern.matcher("Samuel@gmail");
        System.out.println(matcher.matches());

        Pattern pattern2 = Pattern.compile("e.+?d");
        Matcher matcher2 = pattern.matcher("endanged species will end Up dead");
        while (matcher2.find()){
            System.out.println("matched --> "+ matcher2.group());
        }


    }

}
