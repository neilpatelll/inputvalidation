public class Runner {
    
    public static void main(String[] args) {
            
        StringMethods test = new StringMethods();
        test.unusualHello("Neil");
        System.out.println(test.stringRipper(""));
        
        System.out.println(test.evenFooBar("foobarbar"));
        System.out.println(test.evenFooBar("foobar"));
        
        System.out.println(test.sumString("Here are 2 numbers 3 and 5 that should be added."));
        
        System.out.println(test.decode("six perfect quality black jewels amazed the governor", 
                "35 10 10 33 9 24 3 17 41 8 3 20 51 16 38 44 47 32 10 19 38 35 28 49"));
    }
}
