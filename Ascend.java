
public class Ascend {
	public static void main(String[] args) {
	
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random()* lim);
		int b = (int) (Math.random()* lim);
		int c = (int) (Math.random()* lim);
		int max = (Math.max(c, Math.max(b, a)));
		int min = (Math.min(a, Math.min(b, c)));
		int mid = ((a + b + c) - max - min);
		System.out.println( max + " " + mid  + " " + min);
		System.out.println( min + " " + mid + " " + max);
	} 
}
