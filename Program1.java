import java.util.Scanner;
public class Program1 {
	public static String r(double num) {
		String patch="";
		patch+=String.valueOf((int)num)+".";
		if((num-(int)num)*100<10) {patch+="0";}
		patch+=Math.round((num-(int)num)*100);
		return patch;
	}
	public static void main(String[] args) {
		double price=0;
		double markup = .1;
		double tMark = 0;
		double tSales = 0;
		//1.1 = 1 +.1
		Scanner input = new Scanner(System.in);
		while(price>=0) {
			System.out.println("Input your book price:");
			price = input.nextDouble();
			if(price<0) {break;}
			double wholesale = price/(1+markup);
			double mark = wholesale*markup;
			tMark+=mark;
			tSales+=price;
			System.out.println("~~~~~New Book~~~~~");
			System.out.println("New Book's markup: $"+r(mark));
			System.out.println("New Book's wholesale amount: $"+r(wholesale)+"\n");
		}
		System.out.println("Thank you for your purchases!");
		System.out.println("Total sales prices: $"+r(tSales));
		System.out.println("Total markup: $"+r(tMark));
	}
}
