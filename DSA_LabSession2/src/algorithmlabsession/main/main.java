package algorithmlabsession.main;

import java.util.Scanner;

import algorithmlabsession.Transaction.transaction;

 public class main {

	public static void main(String[]args) {
		transaction transaction = new transaction();
		Scanner scanner = new Scanner(System.in);
			int sizeOfArray;
			System.out.println("enter the size of transaction array");
			sizeOfArray = scanner.nextInt();
			System.out.println("enter the value of array");
			int[]array = new int[sizeOfArray];
			for (int i = 0; i <sizeOfArray; i++) {
				array[i]= scanner.nextInt();
				
			}
			System.out.println("enter the total number of targets that need to be achieved");
			int target = scanner.nextInt();
			for (int i =0; i<target; i++) {
				System.out.println("enter the value of target");
				int value = scanner.nextInt();
				transaction.isTargetAchievable(value,array);
			}
	}
	
}
