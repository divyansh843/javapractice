import java.util.Scanner;
public class Test1{
    public static int Average(int arr[]){
        int Pcount = 0;
        int Ncount = 0;
        int Psum = 0;
        int Nsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                Psum += arr[i];
                Pcount ++;
                
            }else{
                Nsum = Nsum + arr[i];
                Ncount ++;
            }    
        }

        int Pavg = Psum/Pcount;
        int Navg = Nsum/Ncount;
        System.out.println(Pavg);
        System.out.println(Navg);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        Average(arr1);
        
    }
}