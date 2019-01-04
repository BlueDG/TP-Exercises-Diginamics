public class TP5{
	
	public static void main(String[] args){
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		int increment = Integer.parseInt(args[2]);
		int cpt = start;
		do {
			//if(cpt % 3 == 0){
			//	System.out.println(cpt);
			//}
			//cpt++;
			
			//System.out.println(cpt);
			//cpt+=3;
			
			System.out.println(cpt);
			cpt += increment;
		} while(cpt < end);
	}
}
