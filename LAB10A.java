import java.util.Scanner;
public class LAB10A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int e,n,target,array[];
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = in.nextInt();
        array=new int[n];
        System.out.println("Enter those " + n + " elements: ");
        for (e = 0; e < n; e++)
array[e]=in.nextInt();
System.out.println("Enter a value to find: ");
target=in.nextInt();
for (e=0;e<n; e++) {
    if (array[e] == target) {
        System.out.println(target + " is present at location: " + (e + 1) + ".");
        break;
    }
}
if(e==n)
System.out.println(target + "is not present in the array.");
    }
}