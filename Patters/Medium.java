package Patters;
public class Medium {

    public void pattern7(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public void pattern8(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void pattern5(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n) {
        for(int i=1;i<=n;i++){
            int start =1;
            if(i%2==0){
                start=0;
            }
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }

    public void pattern12(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern13(int n) {
        int num=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(num +" ");
                num=num+1;
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for(int i=0;i<n;i++){
            char ch = 'A';
            for(char c= ch;c<=ch+i;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Medium pattern = new Medium();
        System.out.println("========Pattern 8=============");
        pattern.pattern8(4);
        System.out.println("========Pattern 9 is mix off patter 7 and 8===============");
        pattern.pattern7(4);
        pattern.pattern8(4);
        System.out.println("=====Patter 10 is mix of patter 2 and 5========");
        pattern.pattern2(4);
        pattern.pattern5(3);
        System.out.println("========Pattern 11=============");
        pattern.pattern11(4);
        System.out.println("========Pattern 12=============");
        pattern.pattern12(4);
        System.out.println("========Pattern 13=============");
        pattern.pattern13(4);
        System.out.println("========Pattern 14=============");
        pattern.pattern14(4);
    }
}
