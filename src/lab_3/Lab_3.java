package lab_3;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab_3 {
    static int[] arr1  ={1,2,3,4,5,6,7,8,9,54,54,3,4};
    static int[] arr2  ={1,2,3,4,5,6,7,8,9,54,54,9,9,9,9,54};
    int arr3[];
    static ArrayList<Integer> nums = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    static int count=0;
    public static void repeatedToice_Descover(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            count=0;
            for (int j = i; j <ar.length; j++) {
                if(ar[i]==ar[j]){
                count++;
                if(count>=2){
                nums.add(ar[i]);
                }
                }
            }
        }
        System.out.println(nums+" is repeated Toice or more");
    }
    public static void repeated5_Descoverer(int ar[]){
        nums.clear();
        
        for (int i = 0; i < ar.length; i++){
            count=0;
            for (int j = i; j <ar.length; j++) {
                if(ar[i]==ar[j]){
                count++;
                if(count>=5){
                nums.add(ar[i]);
                }
                }
            }
        }
        System.out.println(nums+" is repeated 5 times or more");
    }
    public static void add(int ar[]){
//    i didn't understant question 3!
    }
    public static void delete(int ar[],int num){
//    i didn't understant question 3!
    }
    
    public static void main(String[] args) {
        repeatedToice_Descover(arr1);
        repeated5_Descoverer(arr2);
    }
    
}
