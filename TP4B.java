public class TP4B{
	
	public static void main(String[] args){
		
		if(args.length > 0){
			try{
				int x = Integer.parseInt(args[0]);
				System.out.println("valeur ligne commande : "+x);			
				if(x <= 0){
					System.out.println("vide");
				}else{
					switch(x){
						case 1:
							System.out.println("petit");
							break;
						case 2:
							System.out.println("moyen");
							break;
						default:
							System.out.println("grand");
							break;
					}
				}
			}catch (java.lang.NumberFormatException ex){
				System.out.println("argument invalide recu : type integer , "+ ex.getMessage());
			}
		} else {
			System.out.println("argument manquant : type integer");
		}
	}
}
