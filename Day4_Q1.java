import java.util.*;
public class Day4_Q1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number within range 0-9: ");
        int num= sc.nextInt();

            switch (num) {
                case 0:
                System.out.print(num+" is printed as Zero in words");
                break;
                case 1:
                System.out.print(num+" is printed as One in words");
                break;
                case 2:
                System.out.print(num+" is printed as Two in words");
                break;
                case 3:
                System.out.print(num+" is printed as Three in words");
                break;
                case 4:
                System.out.print(num+" is printed as Four in words");
                break;
                case 5:
                System.out.print(num+" is printed as  Five in words");
                break;
                case 6:
                System.out.print(num+" is printed as  Six in words");
                break;
                case 7:
                System.out.print(num+" is printed as  Seven in words");
                break;
                case 8:
                System.out.print(num+" is printed as  Eight in words");
                break;
                case 9:
                System.out.print(num+" is printed as  Nine in words");
                break;
                default:
                System.out.print("Out of Range");
                break;
            
            }
            sc.close();
        
    }
}