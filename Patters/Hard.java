package Patters;

public class Hard {
    public void pattern15(int n) {
        for(int i=n-1;i>=0;i--){
            char ch = 'A';
            for(char c= ch;c<=ch+i;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void pattern16(int n) {
        char ch = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            ch = (char)(ch+1);
            System.out.println();
        }
    }

    public void pattern17(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c = 'A';
            for(int j=0;j<2*i+1;j++){
                System.out.print(c);
                if(j<i){
                    c=(char)(c+1);
                }else{
                    c=(char)(c-1);
                }
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern18(int n) {
        char c = (char)('A'+ n - 1);
        for(int i=0;i<n;i++){

            for(char j =(char) (c-i);j<=c;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pattern19(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*i)-2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*n)-(2*i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern20(int n) {
        // First half of the pattern (upper part)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=(2*n-2)-(2*i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half of the pattern (lower part)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern21(int n) {
        for(int i=1;i<=n;i++){
            for(int j = 1; j <= n; j++){

                if(i == 1 || j == 1 || i == n || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Hard pattern = new Hard();
        System.out.println("========Pattern 15=============");
        pattern.pattern15(4);
        System.out.println("========Pattern 16=============");
        pattern.pattern16(4);
        System.out.println("========Pattern 17=============");
        pattern.pattern17(4);
        System.out.println("========Pattern 18=============");
        pattern.pattern18(4);
        System.out.println("========Pattern 19=============");
        pattern.pattern19(4);
        System.out.println("========Pattern 20=============");
        pattern.pattern20(4);
        System.out.println("========Pattern 21=============");
        pattern.pattern21(4);
    }
}
