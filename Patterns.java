import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=1; i<=5; i++) {
        //     for(int j=1; j<=4; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=5; i++) {
        //     for(int j=4; j>=1; j--) {
        //         if(i==1 | i==5 | j==1 | j==4) {
        //             System.out.print("* ");
        //         } 
        //         else {
        //             System.out.print("  ");
        //         }
        //     } System.out.println();
        // }

        // for(int i=1; i<=5; i++) {
        //     for(int j=5; j>=i; j--) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // for (int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(j<=(n-i)){
        //             System.out.print("  ");
        //         }
        //         else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        
        // int num = 1;
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         if((i+j)%2==0){
        //             System.out.print(1 + " ");
        //         } else {
        //             System.out.print(0 + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         //Spaces
        //         System.out.print(" ");
        //     }
        //     //first part
        //     for(int j=i; j>=1; j) {
        //         System.out.print(j);
        //     }
        //     //Second part
        //     for(int j=2; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("   ");
        //     }
        //     for(int j=1; j<=n; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     //Spaces
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     //numbers
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1; i<=n; i++) {
            //Spaces
            // for(int j=1; j<=n-i; j++) {
            //     System.out.print("  ");
            // }
            //First part
        //     for(int j=1; j<=2*i-1; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--) {
            //Spaces
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     //First part
        //     for(int j=1; j<=2*i-1; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(" *");
        //     }
        //     for(int j=2; j<=i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(" *");
        //     }
        //     for(int j=2; j<=i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=n; j++) {
        //         if(i==1 ||  i==5 || j==1 || j==5) {
        //         System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i+1; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*"+ " ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--) {
        //     for(int j=n-i; j>=1; j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n; j++) {
        //         if(i==1 || j==1 || j==8) {
        //             System.out.print("*");
        //         } 
        //         else if(i==n/2) {
        //             System.out.print("*");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
            //Wrong 
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         if(i==1 || i==8 || j==1 || j==8) {
        //             System.out.print("*"+" ");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // int number = 0;
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         number = number + 1;
        //         System.out.print(number + " ");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++) {
        //         if(j==1 || j==2*i-1 || i==n){
        //             System.out.print("*");
        //         } 
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++) {
        //         if(j==1 || j==2*i-1 || i==n) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++) {
        //         if(j==1 || j==2*i-1) {
        //             System.out.print("*");
        //         } 
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++) {
        //         if(j==1 || j==2*i-1) {
        //             System.out.print("*");
        //         } 
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j--) {
        //         System.out.print(j);
        //     }
        //     for(int j=2; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j--) {
        //         System.out.print(j);
        //     }
        //     for(int j=2; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--) {
        //     for(int j=n; j>=i; j--) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=i; j>=1; j--) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n; j++) {
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }
        //         else {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         if(j%2==0){
        //             System.out.print("0");
        //         }
        //         else {
        //             System.out.print("1");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j<=n; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //     for(int j=1; j<i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j<=n; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=n; j>=i; j--) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--) {
        //     for(int j=i; j>=1; j--) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=2; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=i-1; j>=1; j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j<=n; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //     for(int j=i-1; j>=1; j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j<=n; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("1");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++) {
        //     int num = i;
        //     for(int j=1; j<=i; j++) { 
        //         System.out.print(num+" ");
        //         num = num+n-j;
        //     }
        //     System.out.println();
        // }
        
        // int alphabet = 65;
        // for(int i=0; i<=n; i++) {
        //     for(int j=0; j<=i; j++) {
        //         System.out.print((char)(alphabet+j)+" ");
        //     }
        //     System.out.println();
        // }
        
        // int alphabet = 65;
        // for(int i=0; i<=n; i++) {
        //     for(int j=0; j<=i; j++) {
        //         System.out.print((char)(alphabet+i)+" ");
        //     }
        //     System.out.println();
        // }
        
        // int alphabet = 65;
        // for(int i=0; i<=n; i++) {
        //     for(int j=0; j<=n-i; j++) {
        //         System.out.print((char)(alphabet+j)+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0; i<=n; i++) {
        //     for(int j=0; j<=i; j++) {
        //         System.out.print((char)(alphabet+j)+" ");
        //     }
        //     System.out.println();
        // }
        
        int alphabet = 65;
        // for(int i=0; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<=i; j++) {
        //         System.out.print((char)(alphabet+j)+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            
            for(int j=0; j<=2*i+1; j++) {
                if(j==0 || j==2*i-1 || i==n) {
                    System.out.print((char)(alphabet+i)+" ");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=0; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            
            for(int j=0; j<=2*i+1; j++) {
                if(j==0 || j==2*i-1 || i==n) {
                    System.out.print((char)(alphabet+i)+" ");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
