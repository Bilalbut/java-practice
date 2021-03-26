import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int total = n * m;
        
        if (k < total) {
            if (k == n || k == m) {
                System.out.println("YES");
            } else if (k % n == 0 || k % m == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");    
            }         
        } else {
            System.out.println("NO");             
        }                
    }                                  
}
