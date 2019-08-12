package numbers;

public class nums {
	static String[] ones = {"one","two","three","four","five","six","seven","eight","nine","ten",
	"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String[] tens = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	static String[] places = {"thousand","million","billion","trillion","quadrillion","quintillion",
	"sextillion","septillion","octillion","nonillion","decillion","undecillion","duodecillion",
	"tredecillion","quattuordecillion","quindecillion","sexdecillion","septendecillion",
	"octodecillion","novemdecillion","viginitillion","unvigintillion","duovigintillion",
	"trevigintillion","quattuorvigintillion","quinvigintillion","sexvigintillion",
	"septenvigintillion","octovigintillion","novemvigintillion","trigintillion",
	"untrigintillion","duotrigintillion"};
	static String word(int n,boolean ye){
		String ok = "";
		if(n>=100) {ok+=ones[(int)(n/100)-1] + " hundred ";}
		if(ye && (n%100)<10) {ok+="and ";}
		if(n%100<20 && n%100>0){ok+=ones[(n%100)-1]+" ";}
		else if(n%100>=20) {
			ok+=tens[((int)(n%100)/10)-2] + " ";
			if((n%100)%10 > 0) {ok+=ones[((n%100)%10)-1]+" ";}
		}
		return ok;
	};
	public static void main(String[] args) {
		String num = "87654678987654356787654678760000011";
		String number = "";
		if(num.length()%3>0 && Integer.valueOf(num.substring(0,num.length()%3)) > 0) {
			number+=word(Integer.valueOf(num.substring(0,num.length()%3)),false)+places[(int)(num.length()-4)/3]+" ";
		}
		for(int i=num.length()%3;i<num.length();i+=3) {
			if(Integer.valueOf(num.substring(i,i+3))>0) {
				int help = (int) (Math.ceil((num.length()-num.length()%3) -i+num.length()%3)/3)-2;
				if(help==-1) {number+=word(Integer.valueOf(num.substring(i,i+3)),true);}
				else {
					number+=word(Integer.valueOf(num.substring(i,i+3)),false)+places[help]+" ";
				}
			}
		}
		if(number.length()==0) {number+="zero";}
		System.out.println(number);
	}
}
