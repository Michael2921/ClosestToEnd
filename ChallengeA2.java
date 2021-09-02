import java.util.ArrayList;

public class ChallengeA2 {
    public static void main(String[] args) {
        int myArray[] = new int[]{1,2,3,4,5};
        int myArray2[] = new int[]{3,5,10,0,8,7,9,10,2,6};
        int myArray3[] = new int[] {5,10,0,10,8,3};
        int myArray4[] = new int[] {5,0,10,3,8,10};
        System.out.println(computeSum(myArray));
        System.out.println(findLast(myArray2, 10));
        System.out.println(findClosestToEnd(myArray3, 10));



    }
    //Algorithm to compute sum of elements in array
    public static int computeSum(int[] array){
        int sum = 0;
        for(int x : array){
            sum = sum+x;
        }
        return sum;
    }

    public static int findLast(int[] array, int num){
        for(int counter = array.length - 1; counter >=0; counter--){
            if(array[counter] == num){
                return counter;
            }
        }
        return 0;
    }

    public static int findClosestToEnd(int[] array, int num){
        int anscount = 0;
        int anscount2 = 0;
        int count;
        int count2;
        int min = 0;
        int max = array.length -1;
        
        for(count = 0; count < array.length - 1; count++){
            if(array[count] == num){
                anscount = count;
                break;

            }
        }

        for(count2 = array.length - 1; count2 >= 0; count2--){
            if(array[count2] == num){
                anscount2 = count2;
                break;
            }
        }

        if(anscount - min < max - anscount2){
            return anscount;
        }

        else if(max - anscount2 < anscount - min){
            return count2;
        }

        return -1;

    }
}
