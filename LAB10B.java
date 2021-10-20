import java.util.Scanner;
public class LAB10B {
    public static void BubbleSort(int[] arr){
        int n=arr.length;
        int temp=0;
        for(int i=0;i <n;i++){
            for(int j=1; j<(n-i); j++){
                if (arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                }
            }
        }
    }
public static void BinarySearch(int arr[], int target){
        int first=0;
        int last=arr.length-1;
        int mid=(first+last)/2;

        while (first <=last){

            System.out.println("Low is " + first);
            System.out.println("High is "+ (last+1));
            System.out.println("Mid is "+ mid);
            System.out.println("Searching");
            if (arr[mid] < target) {
                first = mid + 1;
            }
            else if (arr[mid]==target){
                System.out.println("The target is in the set");
                break;
            }else{
                last =mid-1;
            }
            mid=(first+last)/2;
        }
        if (first > last){
            System.out.println("Target not in set");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];
        System.out.println("Please enter 11 numbers:");
        for(int i = 0;i<11;++i){
            System.out.print("Integer "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("What is the target number: ");
        int target = sc.nextInt();
        BubbleSort(arr);
        System.out.println("The sorted set is : ");
        for(int i = 0;i<11;++i){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();//newline
        BinarySearch(arr, target);
    }
}