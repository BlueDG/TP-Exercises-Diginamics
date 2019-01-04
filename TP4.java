public class TP4{
	
	public static void main(String[] args){
		
		float x = Float.parseFloat(args[0]);
		float resultat = 0f;
	
		System.out.println("valeur ligne commande : "+x);
		
		if(x < 1000f ){
			System.out.println("0%");
			resultat = x;
		}else if ( x >=1000 && x < 2000f){
			System.out.println("1%");
			resultat = x * (1f/100f);
		}else if ( x >=2000 && x < 5000f){
			System.out.println("3%");
			resultat = x * (3f/100f);
		}else if ( x >=5000){
			System.out.println("5%");
			resultat = x * (5f/100f);
		}
		System.out.println(x+ " => " + resultat);
	}
}