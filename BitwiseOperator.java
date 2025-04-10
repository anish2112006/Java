public class BitwiseOperator {
    public static void main(String args[]) {
        int a = 5;  
        int b = 3;  

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");

 
        int andResult = a & b;
        System.out.println("a & b = " + andResult + " (" + Integer.toBinaryString(andResult) + ")");

        int orResult = a | b;
        System.out.println("a | b = " + orResult + " (" + Integer.toBinaryString(orResult) + ")");

        
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult + " (" + Integer.toBinaryString(xorResult) + ")");

      
        int notA = ~a;
        System.out.println("~a = " + notA + " (" + Integer.toBinaryString(notA) + ")");

      
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift + " (" + Integer.toBinaryString(leftShift) + ")");

      
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + " (" + Integer.toBinaryString(rightShift) + ")");
    }
}
