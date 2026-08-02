import java.util.*;
public class PrintName5times {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int count = 0;
        printName(name,count);
    }    
    static void printName(String name , int count){
        System.out.println(name);
        count++;
        if(count == 5);
        printName(name,count);
    }
}


