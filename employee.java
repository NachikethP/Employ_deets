

import java.util.Scanner;

class employ_details{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of employees:");
        int n = sc.nextInt();
        String[] name =new String[n];
        int[] salary= new int[n];
        int[] year= new int[n];
        String[] address = new String[n];
        for(int i = 0; i< name.length; i++)
        {   System.out.println("Employee no."+(i+1));
            System.out.println("Enter the name:");
            name[i] = sc.next();
            System.out.println("Enter the salary:");
            salary[i] = sc.nextInt();
            System.out.println("Enter the year of joining:");
            year[i] = sc.nextInt();
            System.out.println("Enter the address:");
            address[i]= sc.next();
        }
        System.out.println("name\tsalary\tyear\taddress");
        for(int i =0;i< name.length;i++){
            System.out.println(name[i]+"\t"+salary[i]+"\t"+year[i]+"\t"+address[i]);
        }
    }
}
