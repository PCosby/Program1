package numbers;
import java.util.ArrayList;

public class test {
	static String reverse(String st){
		String ok = "";
		for(int i=st.length()-1;i>=0;i--) {
			ok+=st.charAt(i);
		}
		return ok;
	}
	static String commas(String st) {
		String ok ="";
		ok+=st.substring(0,st.length()%3);
		for(int i=st.length()%3;i<st.length();i+=3) {
			if (ok.length()!=0) {ok+=",";}
			ok+=st.substring(i,i+3);
		}
		return ok;
	}
	static String clean(String st) {
		while(st.charAt(0)=='0' && st.length()>1) {
			st = st.substring(1);
		}
		return st;
	}
	public static void main(String[] args) {
		String num1 = "435353635";
		String num2 = "000001";
		String total="";
		boolean end = false;
		ArrayList<String> sum = new ArrayList<String>();
		for(int i=0;i<num1.length();i++) {
			for(int j=0;j<num2.length();j++) {
				int n1 = Integer.parseInt(""+num1.charAt(i)); //5
				int n2 = Integer.parseInt(""+num2.charAt(j)); //1
				String zeros ="";
				for(int q=1;q<=num1.length()-1-i;q++){zeros+="0";}
				for(int q=1;q<=num2.length()-1-j;q++){zeros+="0";}
				
				sum.add((n1*n2)+zeros);
			}
		}

		int offset = 0;
		int leftover = 0;
		end = false;
		while(!end) {
			int s = 0;
			end = true;
			for(int i=0;i<sum.size();i++) {
				if (offset<sum.get(i).length()){
					s+=Integer.parseInt(""+sum.get(i).charAt((sum.get(i).length()-1-offset)));
					end = false;
				}
			}
			s+=leftover;
			offset++;
			leftover = (int)(s/10);
			if(s%10!=0 || !end){total+=s%10;}
		}
		System.out.println(num1+" x "+num2+" = "+commas(clean(reverse(total))));
	}
}

