import java.util.Scanner;

public class StringMethods {
    
    public void unusualHello(String name) {
        System.out.println("Hello " + name + ", you dummy!"); }
    public String stringRipper(String str){
        return str.substring(0, 1) + str.substring(str.length()-1);
    
    public boolean evenFooBar(String s){
        int foos = 0;
        int bars = 0;
        for(int i= 0; i < s.length() - 2; i++){
            if(s.substring(i, i +3).equals("foo")){
                foos++;
            }
            if(s.substring(i, i + 3).equals("bar")){
                bars++;
            }
        }
        System.out.println("foos = " + foos);
        System.out.println("bars = " + bars);
        return foos - bars ==0;
    }
        public static int sumString(String str){
        Scanner scan = new Scanner(str);
        int sum = 0;
        while(scan.hasNext()){
            if(scan.hasNextInt())
                sum += scan.nextInt();
            else
                scan.next();
        }
        return sum;
    }
    }
    
    