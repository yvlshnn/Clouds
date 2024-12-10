public class CumulativeSumProgram {

   
    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;  
        
        for (int num : numbers) {
            int cumulativeSum = 0;  

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }
            
            System.out.println("Cumulative sum for " + num + " = " + cumulativeSum);
            
           
            totalSum += cumulativeSum;
        }
        
        return totalSum;  
    }

    public static void main(String[] args) {
      
        int total = cumulativeSum(4, 5, 10);
        
        System.out.println("Total sum of all cumulative sums = " + total);
    }
}
