public class TP6{
	
	public static void main(String[] args){
		long x = Long.parseLong(args[0]);
		long res = 1;
		for (long i = 1; i <= x ; i++){
			res *= i;
		}
		System.out.println(res);
	}
}
