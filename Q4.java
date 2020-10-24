class Q4 {
    public static void main(String[] args){
      int n = 0;
        
        for (int a = 1; a < 1000; a++){
            for (int b = 1; b < 1000; b++){
                int c = 1000 - a - b;
                if ( c*c == a*a + b*b && a + b + c == 1000){                    
                    n = a * b * c;
                    System.out.println("a: " + a);
                    System.out.println("b: " + b);
                    System.out.println("c: " + c);
                    System.out.println(n);                    
                }               
            }
        }
    }
}