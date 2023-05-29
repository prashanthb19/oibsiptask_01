/*
OASIS INFOBYTE

 Intern Name : Bommagoni Prashanth

 * Task Number : 01
 
 * Task Name : Online Reservation System(ORS)
 
 * Task Description : 
This Online Reservation System will include all the necessary fields which are required during
online reservation system. This Online Reservation System will be easy to use and can be used by
any person. The basic idea behind this project is to save data in a central database which can be
accessed by any authorize person to get information and saves time and burden which are being
faced by their customers.

Modules under the project :
Login Form 

Reservation System 

Cancellation Form 
*/
//Source Code:
import java.util.*;
import java.util.Date;
class ORSmain
{
    public static void main(String args[])
    {
        int farePrice = 100; int tkt = 0; int Operation,PIN;
        boolean b = false;
        String Name; String train = ""; String PNR_No = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Welcome to Online ticket Booking*******");
        System.out.println("\'ENTER 1 TO BOOK TICKETS\'");
        int n = sc.nextInt();
        int pin[] = new int[n];
        String name[] = new String[n];
        System.out.println("Press 1 to Create account or Press 2 to Login\n 1.Create Account \n 2.Login");

        Operation = sc.nextInt();
        switch(Operation)
        {
            case 1:
            {
                System.out.println("*******CREATE NEW ACCOUNT*******");
                System.out.println("---Enter the details to create account---");
                for(int i = 0;i<n;i++)
                {
                    System.out.println("Enter new Name");
                    sc.nextLine();
                    name[i] = sc.nextLine();
                    System.out.println("Enter new PIN Number");
                    pin[i] = sc.nextInt();


                }


                System.out.println("-----Your details were recorded please login to continue-----");
                break;
            }
            case 2:
            {

                name[0] = "ROCKY";
                pin[0] = 1111;
                break;
            }
        }



        while(true)
        {
            System.out.println("***** LOGIN FORM *****");
            System.out.println(">>>>>>Login into page for booking tickets<<<<<<");
            System.out.println("Enter Your Name: ");

            Name = sc.next();
            sc.nextLine();
            System.out.println("Enter the PIN: ");
            PIN = sc.nextInt();
            for(int i = 0;i<n;i++)
            {

                if ((PIN == pin[0]) && Name.equals(name[0]) )
                {
                    System.out.println("---Your login is Successful---\n ---Happy Booking!!!---");
                    b = true;
                    break;
                }

                else
                {
                    System.out.println("--Sorry! Your login is Unsuccessful---\n Try again!!---");
                }

            }


            if(b == true)
            {
                System.out.println("...Choose Train...\n 1.Antera Express\n 2.Tandur Express\n3. Goan Express\n4. Shimla Express\n5.Bhansilal Express\n");
                int Option = sc.nextInt();
                switch(Option)
                {
                    case 1:
                    {
                        train ="Antera Express";
                        PNR_No = "423-4888961";
                        break;
                    }
                    case 2:
                    {
                        train ="Tandur Express";
                        PNR_No = "523-4808961";
                        break;
                    }
                    case 3:
                    {
                        train ="Goan Express";
                        PNR_No = "653-4888961";
                        break;
                    }
                    case 4:
                    {
                        train ="Shimla Express";
                        PNR_No = "223-4778961";
                        break;
                    }
                    case 5:
                    {
                        train ="Bhansilal Express";
                        PNR_No = "423-4777961";
                        break;
                    }
                }
                System.out.println("Please Enter 1 for AC or 2 for NON-AC \n1.FOR AC \n2.FOR NON-AC");
                int ac = sc.nextInt();
                if(ac==1)
                {
                    tkt = farePrice+10;
                }
                else
                {
                    tkt = farePrice;
                }
                System.out.println("Please Enter.. \n1.Sleeper\n2.NON-Sleeper");
                int window = sc.nextInt();
                if(window==1)
                {
                    tkt = tkt+10;
                }
                else
                {
                    tkt = tkt+0;
                }
                System.out.println("---- IRCTC-----");
                System.out.println("JOURNEY CUM RESERVATION TICKET");
                System.out.println(""+train +"PNR:"+PNR_No+"");

                Date date = new Date();
                System.out.println(""+ date.toString());
                System.out.println("Fare price = 50");
                System.out.printf( "-Please pay %d FOR THE TICKET-", tkt);
                System.out.println("\n");

                System.out.println("ENTER 1 TO CANCEL THE TICKET \n ENTER 0 to exit");
                int cnc = sc.nextInt();
                if(cnc == 1)
                {

                    System.out.println("----Your Ticket Has Been Cancelled----");
                }
                if(cnc == 0)
                {
                    System.exit(0);
                }
            }
sc.close();
        }
    }

}