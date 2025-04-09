package LargeStrings;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Constructor 1
        StringBuffer sb = new StringBuffer();  // 16 capacity under this constructor
        System.out.println("Capacity of StringBuffer sb: " + sb.capacity());

        // Constructor 2
        StringBuffer sb2 = new StringBuffer("Karan Jangid");  

        // Constructor 3
        StringBuffer sb3 = new StringBuffer(30); 
        System.out.println(sb3.capacity());

        sb.append("WeMakeDevs");
        sb.append(" is nice!");  // it should not create new object

        // sb.insert(2, " Rahul ");

        sb.replace(1, 5, "Jangid");
        sb.delete(1, 5);
        // sb.reverse();

        String str = sb.toString();
        System.out.println(str);

        // Random random = new Random();
        // System.out.println(random.nextFloat());

        // System.out.println((char)(97 + 1));

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        // removing white spaces
        String sentence = "H h mnmf jjhe  j ol ";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        // Split
        String arr = "Karan Neeraj Virat Rolando";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
}
