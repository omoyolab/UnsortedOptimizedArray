/**
 * Lab 3 COSC 2436-81501  FA2019
 *
 * @author Abimbola Omoyola
 * @version (10/03/2019)
 */
import javax.swing.JOptionPane;

public class UnsortedOptimizedArray_Omoyola {
	
	private int next;
	private int size;
	private Account_Omoyola [] data;
	
	// No argument constructor
	public UnsortedOptimizedArray_Omoyola() {
		next = 0;
		size = 100;
		data = new Account_Omoyola[size];		
	}
	
	//Parameterized Constructor
	public UnsortedOptimizedArray_Omoyola(int s) {
		next = 0;
		data = new Account_Omoyola[s];	
		size = s;
	}
	
	//Insert Method
	public boolean insert(Account_Omoyola newAccount) {
		if(next >= size)
			return false;
		data[next]= newAccount.deepCopy();
		
		if (data[next]== null) {
			JOptionPane.showMessageDialog(null, "Insert Account Faliure");
			return false;
		}
		
		next = next +1;
		JOptionPane.showMessageDialog(null, "Insert Account success");
		return true;
		
	}
	
	//Fetch Method
	public Account_Omoyola fetch(String targetKey) {
		Account_Omoyola newAccount;
		Account_Omoyola temp;
		//sequential search
		int i = 0;
		while (i < next && !(data[i].compareTo(targetKey)== 0))
		{
			i++;
		}
		if (i == next)
			return null;
		newAccount = data[i].deepCopy();
		if(i != 0) {
			temp = data[ i-1 ];
			data[i -1 ] = data[i];
			data[i] = temp;
		}
		return newAccount;
	}
	//Delete Method
	public boolean delete(String targetKey) {
		int i = 0;
		while(i < next && !(data[i].compareTo(targetKey)== 0))
		{
			i++;
		}
		if(i == next) {
			JOptionPane.showMessageDialog(null, "Delete Fail");
			return false;
		}
			
		data[i] = data[ next - 1];
		data[next - 1 ] = null;
		next = next - 1;
		JOptionPane.showMessageDialog(null, "Delete Success!");
		return true;
	}
	
	//Update Method
	public boolean update(String targetKey, Account_Omoyola newAccount) {
		if(delete(targetKey)== false)
			return false;
		else if(insert(newAccount)== false){
		JOptionPane.showMessageDialog(null, "Update Failed!");
			return false;
              }else{
		JOptionPane.showMessageDialog(null, "Update Sucessfull!");
			return true;
                 }
	}
	
	// Show All Method
	public void showAll() {
		for(int i = 0; i < next; i++)
			System.out.println(data[i].toString());
	}
}