public class Program2 {
	public static void main(String[] args) {
		int flips = 100;
		int[] chances = {0,0};
		for (int i=0;i<flips;i++) {
			chances[(int)(Math.random()*2)]++;
		}
		System.out.println("Heads: "+chances[0]);
		System.out.println("Tails: "+chances[1]);
	}
}
