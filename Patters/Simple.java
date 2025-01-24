package Patters;

public class Simple {

    public void pattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

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

    public static void main(String[] args){
        Simple pattern1 = new Simple();
        System.out.println("=======Pattern1==========");
        pattern1.pattern1(5);
        System.out.println("=======Pattern2==========");
        pattern1.pattern2(5);
        System.out.println("=======Pattern3==========");
        pattern1.pattern3(5);
        System.out.println("=======Pattern4==========");
        pattern1.pattern4(5);
        System.out.println("=======Pattern5==========");
        pattern1.pattern5(5);
        System.out.println("=======Pattern6==========");
        pattern1.pattern6(5);
        System.out.println("=======Pattern7==========");
        pattern1.pattern7(5);
    }
}
