import java.util.Scanner;
public class employee
{
    public static void main(String[] args) 
    {
        int count,esalarytemp,flag = 0;

        Scanner scan = new Scanner(System.in);
     
        System.out.print("How many  employees information you want enter :");
        count = scan.nextInt();
        String eName[] = new String[count];
        int salary[] = new int[count];
        int  no[] = new int[count];
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
             for(int i = 0; i < count; i++)
        {
   System.out.println("Enter the eno :");

            no[i] = scan2.nextInt();
   System.out.println("Enter the name :");
        
            eName[i] = scan2.nextLine();
        System.out.println(" Enter the salary :");
        
            salary[i] = scan2.nextInt();
        }
      
          Scanner s = new Scanner(System.in);
        System.out.print("Enter the employee number you want to find:");
        int x = s.nextInt();
        for(int i = 0; i < count; i++)
        {
            if(no[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Employee id "+x+" found:");
        }
        else
        {
            System.out.println("Employee id not found");
        }

  scan.close();
        scan2.close();
scan3.close();
scan4.close();
s.close();
        
    }
}
