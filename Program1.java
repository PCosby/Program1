import java.util.Scanner;
public class Program1 {
	public static String r(double num) {
		String patch="";
		patch+=String.valueOf((int)Math.floor(num))+".";
		if(num-Math.floor(num)==0) {patch+="00";}
		else{patch+=Math.round((num-Math.floor(num))*100);}
		return patch;
	}
	public static void main(String[] args) {
		double price=0;
		double markup = .1;
		double tMark = 0;
		double tSales = 0;
		Scanner input = new Scanner(System.in);
		while(price>=0) {
			System.out.println("Input your book price:");
			price = input.nextDouble();
			if(price<0) {break;}
			tMark+=price*markup;
			tSales+=price*(1+markup);
			System.out.println("~~~~~New Book~~~~~");
			System.out.println("New Book's markup: $"+r(price*markup));
			System.out.println("New Book's wholesale amount: $"+r(price*(1+markup))+"\n");
		}
		System.out.println("Thank you for your purchases!");
		System.out.println("Total sales prices: $"+r(tSales));
		System.out.println("Total markup: $"+r(tMark));
	}
}
