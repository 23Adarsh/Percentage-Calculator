import java.util.Scanner;
public class percentage{
    public static void main(String[] args)
    {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Your Total Mark -:");
       Double  Total_marks = s.nextDouble();
        
        System.out.println("Enter Your Total sub -:");
       Double  Total_sub = s.nextDouble();
       
        System.out.print("Percentage is -: ");

        Double Percentage = (Total_marks/Total_sub);
        System.out.print(Percentage);
    }
}