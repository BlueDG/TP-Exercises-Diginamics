public class TP7{
	
	public static void main(String[] args){
		int nombrePremierChercher = Integer.parseInt(args[0]);
		int nombrePremierTrouver = 0;
		int nombreATester = 2;
		
		while(nombrePremierTrouver < nombrePremierChercher){
			boolean diviser = false;
			for(int i = 2;i < nombreATester;i++){
				if(nombreATester % i == 0){
					diviser = true;
					break;
				}
			}
			if(!diviser){
				System.out.println("premier : "+nombreATester);
				nombrePremierTrouver++;
			}
			nombreATester++;
		}	
	}		
}
