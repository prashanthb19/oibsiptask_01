/*OASIS INFOBYTE
  
Intern Name : Bommagoni Prashanth

 * Task Number : 03
 
 * Task Name :  ATM INTERFACE
 
 * Task Description :We have all come across ATMs in our cities and it is built on Java. This complex project consists of
five different classes and is a console-based application. When the system starts the user is
prompted with user id and user pin. On entering the details successfully, then ATM functionalities
are unlocked. The project allows to perform following operations:

Transactions History

Withdraw

Deposit

Transfer

Quit
*/
//Source Code: 

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Project_ATM{
    private double balance;
    private double depositAmount;
    private double withdrawalAmount;

    public Project_ATM(){
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getDepositAmount(){
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount){
        this.depositAmount = depositAmount;
    }
    public double getWithdrawalAmount(){
        return withdrawalAmount;
    }
    public void setWithdrawAmount(double withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
}


interface AtmOperationsPanel{
    public void viewBalance();
    public void withdrawalAmount(double withdrawalAmount);
    public void depositAmount(double depositAmount);
    public void viewMiniStatement();
}


class AtmOperations implements AtmOperationsPanel{
    Project_ATM pa=new Project_ATM();
    Map<Double,String>ministmt=new HashMap<>();
    public void viewBalance(){
        System.out.println("\nAvailable Balance is : "+pa.getBalance());
    }
    public void withdrawalAmount(double withdrawalAmount){
        if(withdrawalAmount <= pa.getBalance()){
            ministmt.put(withdrawalAmount,"Amount is Withdrawn");
            System.out.println("\nPlease Collect the Cash "+withdrawalAmount);
            pa.setBalance(pa.getBalance()-withdrawalAmount);
            viewBalance();
        }
        else{
            System.out.println("\nInsufficient Balance !!!");
        }
    }
    public void depositAmount(double depositAmount){
        System.out.println("\n");
        ministmt.put(depositAmount,"Amount Deposited ");
        System.out.println(depositAmount+" Deposited Successfully !!!");
        pa.setBalance(pa.getBalance()+depositAmount);
        viewBalance();
    }
    public void viewMiniStatement(){
        for(Map.Entry<Double,String>m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }

}


class mainATM{
    public static void main(String[] args){

        AtmOperations opn=new AtmOperations();

        int atmNo=1111;
        int atmPin=1091;
        Scanner cs=new Scanner(System.in);
        System.out.println("\nWelcome to ATM Services !!!");
        System.out.print("\nPlease enter your ATM Number :");
        int atmNumber=cs.nextInt();
        System.out.print("Please enter your ATM Pin Number :");
        int pin=cs.nextInt();


        if((atmNo == atmNumber)&&(atmPin == pin)){
            while(true){
                System.out.print("\n1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Mini Statement\n5. Exit");
                System.out.println("\n");
                System.out.println("\nEnter your Choice: ");
                int chc=cs.nextInt();
                if(chc==1){
                    opn.viewBalance();
                }
                else if(chc==2){
                    System.out.println("\nEnter amount to withdraw :");
                    double withdrawalAmount=cs.nextDouble();
                    opn.withdrawalAmount(withdrawalAmount);
                }
                else if(chc==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=cs.nextDouble();
                    opn.depositAmount(depositAmount);
                }
                else if(chc==4){
                    opn.viewMiniStatement();
                }
                else if(chc==5){
                    System.out.println("\nCollect your ATM Card\nThank You for using ATM Services !!!");
                    break;
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.print("incorrect ATM Number or PIN");
        }
        cs.close();
    }
}