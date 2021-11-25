import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    double meal_cost = scan.nextDouble();
    int tip_percent = scan.nextInt();
    int tax_percent = scan.nextInt();
    scan.close();
   
    double tip = meal_cost*tip_percent/100;
    double tax=meal_cost*tax_percent/100;
    
    int total_cost = (int) Math.round(meal_cost + tip + tax);
    
    System.out.print(total_cost);  
    }
}
