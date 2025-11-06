
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate1 = Double.parseDouble(args[1]);
		double rate = (1 + rate1/100);
		int years = Integer.parseInt(args[2]);
		double expValue = (currentValue * Math.pow(rate, years));
		System.out.println("After " + years + " years, $" + currentValue +   " saved at " + rate1 + "% will yield $" + (int)expValue);
	}
                 
}



 