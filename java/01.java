import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        
        int i1 = scan.nextInt();
        double d1= scan.nextDouble();
        String s1 = "";
        scan.nextLine();
        s1=scan.nextLine();
        
        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.print(s+s1);
    }
}
