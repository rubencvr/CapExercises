import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FindAverage {
	
	public List<Integer> firstnumbers = new ArrayList<>();
	
	public int one;
	public int two;
	public int tre;; int average;
	public Scanner scanner = new Scanner(System.in);
	
	public void ScanfirtInts() {
		System.out.println("Enter the first number");
		one = scanner.nextInt();
		firstnumbers.add(one);
		
		System.out.println("Enter the second number");
		two = scanner.nextInt();
		firstnumbers.add(two);
		
		System.out.println("Enter the tird number");
		tre = scanner.nextInt();
		firstnumbers.add(tre);
		
		System.out.println("Enter the Average number");
		average = scanner.nextInt();
		
	}
	
	public void PintAverage() {
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
	
	public void PrintList() {
		for(Integer integer : firstnumbers) {
			System.out.println(integer);
		}
	}
}
