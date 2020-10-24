class Q3 {
    public static void main(String[] args){
        int SumS = 0;
        int sSum = 0;
        int Difference = 0;
        
        for (int i = 1; i <= 100; i++){
            SumS = SumS + (int) Math.pow(i,2);
        }
        
        for (int k = 1; k <= 100; k++){
            sSum = sSum + k;
        }
        sSum = (int) Math.pow(sSum,2);
        
        Difference = sSum - SumS;
        System.out.println(Difference);        
    }
}