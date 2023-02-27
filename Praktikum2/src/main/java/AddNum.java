/**
 * <h1> Add Two Numbers! </h1>
 * The AddNum program implements an application that
 * simply add two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more 
 * user friendly and it is assumed as a high quality code.
 * 
 * @author Jeihan Ilham Kusumawardhana
 * @version 1.0
 * @since 2023-01-24
 */
public class AddNum {
    
    /**
     * This method is used to add two integers. This is
     * the simplest form of a class method, just to
     * show the usage of various javadoc Tags.
     * @param numA This is the first parameter to AddNum method
     * @param numB This is the second parameter to AddNum method
     * @return int This returns sum of numA and numB.
     */
      public int addNum(int numA, int numB){
          return numA + numB;
      }
      
      /**
       * This is the main method which makes use of addNum method
       */
      
        public static void main(String args[]){
            AddNum obj = new AddNum();
            int sum = obj.addNum(10, 20);
            
            System.out.println("Sum of 10 and 20 is : " + sum);
        }
}   
