import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FindAverage {
	
	private List<Integer> firstnumbers; 
	
	private int one;
	private int two;
	private int tre;
	private int average;
	private Scanner scanner = new Scanner(System.in);
	
	public FindAverage() {
		firstnumbers = new ArrayList<>();
		ScanfirstInts();
		PrintList();
		PrintAverage();
		
	}
	
	private void ScanfirstInts() {
		System.out.println("Enter the first number");
		one = scanner.nextInt();
		firstnumbers.add(one);
		
		System.out.println("Enter the second number");
		two = scanner.nextInt();
		firstnumbers.add(two);
		
		System.out.println("Enter the third number");
		tre = scanner.nextInt();
		firstnumbers.add(tre);
		
		System.out.println("Enter the Average number");
		average = scanner.nextInt();
		
	}
	
	private void PrintAverage() {
		Integer sum = 0;
		
		for(Integer integer : firstnumbers) {
			sum = sum + integer;
		}
		average= sum/average;
		System.out.println("average value :"+average);
		System.out.println("sum value : "+sum);
		double result = sum/average;
		System.out.println("This is the average of the chosen numbers: "+result);
	}
	
	private void PrintList() {
		for(Integer integer : firstnumbers) {
			System.out.println(integer);
		}
	}
}
