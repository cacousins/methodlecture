package methodsandclass;

public class MethodsAndClass {

    
    public static void main(String[] args) {
        MethodsAndClass printer = new MethodsAndClass();
        printer.printSomething();
        printer.addition(12, 12);
        //System.out.println(printer.product(4, 4));
        
        int randomVariable = printer.product(4, 4);
        System.out.println(randomVariable);
        
        
    }
    
    /*
        Method name:    printSomething()
        Purpose:        print a statement
        accepts:        nothing
        returns:        nothing
    */
    
    public void printSomething(){
        System.out.println("My method is printing something");
    }
    
    
     /*
        Method name:    addition()
        Purpose:        sum two numbers
        accepts:        two integers
        returns:        nothing
    */
    
    public void addition(int number1, int number2){
        System.out.println(number1 + number2);
    }
    
     /*
        Method name:    product()
        Purpose:        return the product two numbers
        accepts:        two integers
        returns:        int
    */
    
    public int product(int number1, int number2){
        int prod = number1*number2;
        return prod;
    }
    
    
}
