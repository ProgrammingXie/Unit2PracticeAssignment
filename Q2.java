class Q2 {
    public static void main(String[] args){
        int PreviousNumber = 1;
        int Number = 0;
        int Total = 0;
        int Double = 0;
        
        while (Number < 4000000){
            Total = PreviousNumber + Number;
            PreviousNumber = Number;
            Number = Total;
            if (Number % 2 == 0){
                Double += Number;
            }
            
        }   
        
        System.out.println(Double);
    }
}