import java.util.*;
public class largestNumberArray {
    public static void main(String[] args)

    {

        int numbers[] = { 10, 50, -4, 67, 8888 };
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            else if(numbers[i]<smallest)
            {

            }

        }
          System.out.println( "array given"+Arrays.toString(numbers));
    System.out.println(largest);
    System.out.println(smallest);

    }
  

}