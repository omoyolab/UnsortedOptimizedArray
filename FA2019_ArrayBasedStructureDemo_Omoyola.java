/**
 * Lab 3 COSC 2436-81501  FA2019
 *
 * @author Abimbola Omoyola
 * @version (10/03/2019)
/**
 * Lab 3 COSC 2436-81501  FA2019
 *
 * @author Abimbola Omoyola
 * @version (10/03/2019)
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class FA2019_ArrayBasedStructureDemo_Omoyola {

    
    public static void main(String [] args)
    {
        
        int userInput,userInput2;
        String accountName , accountNumber, choice;
        double bal;
            
        UnsortedOptimizedArray_Omoyola accountArray = new UnsortedOptimizedArray_Omoyola();
        Account_Omoyola fetchedAccount,account, mySavingAccount,myCheckingAccount;
        ArrayList arrayListStructure = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        
        
do {
    System.out.println(
                    " MAIN MENU \n"+
                    " 1. Unsorted Optimized Array \n" + 
                    " 2. Java ArrayList Structure \n"+
                    " 0. Exit \n"   
                    );
    
    userInput = keyboard.nextInt();
    keyboard.nextLine();
    switch(userInput) {
    // Unsorted Optimized Array structure
    case 1:
        do {
            
            System.out.println(
                    
                            " UNSORTED OPTIMIZED ARRAY OPERATIONS \n"+
                            " 1. Insert One Account \n" + 
                            " 2. Verify Encapsulation\n"+
                            " 3. Update an Account \n" + 
                            " 4. Delete an Account\n"+
                            " 5. Show all Accounts\n"+
                            " 0. Exit \n"                           
                    );
            userInput2 = keyboard.nextInt();
            keyboard.nextLine();
        switch(userInput2) {
        
        case 1:
        // Insert 3 accounts with a loop
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Enter your Name ");
            accountName = keyboard.nextLine();
            
            System.out.println("Enter Your Account Number");
            accountNumber = keyboard.nextLine();
            
            System.out.println("Enter a Starting balance ");
            bal = keyboard.nextDouble();
            keyboard.nextLine();
            
            account = new CheckingAccount_Omoyola(accountName,accountNumber, bal);
            accountArray.insert(account);
                         }
            
            break;
           case 2:
            //Verify encapsulation        
            System.out.println("Enter your Name ");
            accountName = keyboard.nextLine();
            
            System.out.println("Enter Your Account Number");
            accountNumber = keyboard.nextLine();
            
            System.out.println("Enter a Starting balance ");
            bal = keyboard.nextDouble();
            keyboard.nextLine();
            
            myCheckingAccount = new CheckingAccount_Omoyola(accountName,accountNumber, bal);
            
            accountArray.insert(myCheckingAccount);
            System.out.println("Enter a Service Fee: ");
            myCheckingAccount.setFees(keyboard.nextDouble());
            
            fetchedAccount = accountArray.fetch(accountNumber);
            System.out.println("**********Fetched Account*******");
            System.out.println(fetchedAccount.toString());
            System.out.println("**********Checking Account*******");
            System.out.println(myCheckingAccount.toString());
            
            if(myCheckingAccount.getFees()== fetchedAccount.getFees())
            {
                JOptionPane.showMessageDialog(null, "Unsorted Optimized Array is not encapsulated");
             }else
                JOptionPane.showMessageDialog(null, "Unsorted Optimized Array is encapsulated");
            
            
            
         break;
         case 3:
            // Update an Account"      
            System.out.println("Enter your Name ");
            accountName = keyboard.nextLine();
            
            System.out.println("Enter Your Account Number");
            accountNumber = keyboard.nextLine();
            
            System.out.println("Enter a Starting balance ");
            bal = keyboard.nextDouble();
            keyboard.nextLine();
            
            mySavingAccount = new SavingAccount_Omoyola(accountName,accountNumber, bal);
            accountArray.insert(mySavingAccount);
            
            System.out.println("Enter a new Interest Rate: ");
            mySavingAccount.setFees(keyboard.nextDouble());
            accountArray.update(accountNumber,mySavingAccount);
            System.out.println("**********Updated Account**************");
            System.out.println(mySavingAccount.toString());
            
            
            break;
         case 4:
            //Delete Account
            System.out.println("Enter The Account Number you want to delete ");
            choice= keyboard.nextLine();
             accountArray.delete(choice);
            break;
         case 5:
            // Show All Accounts
            accountArray.showAll();
            break;
         }
         }while(userInput2 != 0);
          System.out.println("Thank you. You will be retured to the main menu.......");
          break;
          case 2:
          //ArrayList Structure
          int n = 48;
          int n2 = 95;
          Object tempp ,temp1, temp2, temp3;
          int size;
          
          
          //Insert numbers from 0 to 48 to data structure
          for (int i=1; i<=n; i++) 
              arrayListStructure.add(i);
          JOptionPane.showMessageDialog(null, "0 TO 48 is added to the structure");
          
          //Insert 4 accounts to data structure. They can be either checking account or saving account
          Account_Omoyola Alex = new SavingAccount_Omoyola("Alexander", "738383883", 838.00);
          Account_Omoyola Henry = new SavingAccount_Omoyola("Henry", "7123583", 235.00);
          Account_Omoyola Thomas = new SavingAccount_Omoyola("Thomas", "73555883", 300.00);
          Account_Omoyola Brad = new SavingAccount_Omoyola("Brad", "75587583", 900.00);
            
          arrayListStructure.add(Alex);
          arrayListStructure.add(Thomas);
          arrayListStructure.add(Henry);
          arrayListStructure.add(Brad);
          JOptionPane.showMessageDialog(null, "4 bank account added to the structure");
            
          //Insert more numbers from 49 to 95
          for (int i=49; i<=n2; i++) 
           arrayListStructure.add(i); 
          JOptionPane.showMessageDialog(null, "49 TO 95 is added to the structure");
            
          // Display the size of ArrayList
          JOptionPane.showMessageDialog(null, "The size of arrayListStructure is: "+ arrayListStructure.size());
          
          //Delete the node at index 50 then display the size if ArrayList
          arrayListStructure.remove(49);
          JOptionPane.showMessageDialog(null,"The size of arrayListStructure after node at index 50 was deleted is: " +arrayListStructure.size());
                  
          //Display the node at index 24 (node temp1) and at index 50 (node temp2)
          temp1 = arrayListStructure.get(23);
          System.out.println("**********Node at index 24 *************");
          System.out.print(temp1);
          System.out.println();
          System.out.println("************Node at index 50 *************");
          temp2 = arrayListStructure.get(49);
          System.out.print(temp2);
            
                
          System.out.println("***********Verify Encapsulation *************");
          //Modify minimum amount of node temp2 that have been fetched at index 50
          ((SavingAccount_Omoyola) arrayListStructure.get(49)).setMinimumAmount(300);
                
          //fetch the node at index 50 again and store it to temp3.
          temp3 =arrayListStructure.get(49);
          System.out.print(temp3);
                
          //compare the minimum amount of node temp2 with the minimum amount of node temp3 
          if(((SavingAccount_Omoyola)temp2).getMinimumAmount()== ((SavingAccount_Omoyola)temp3).getMinimumAmount()) {
                    JOptionPane.showMessageDialog(null, "Java ArrayList is unencapsulated");
           }else
                    JOptionPane.showMessageDialog(null, "Java ArrayList is encapsulated");
           break;  
    }       
    
}while(userInput != 0);
       keyboard.close();
       System.out.println("Thank you. The application is terminating.......");
    }

    
    
}