public class Pongexo{
	
	public static void main(String[] args){
		final int sizeX = 60;
		final int sizeY = 26;
		
		boolean tab [][] = new boolean [sizeX][sizeY];
		int x = 0;
		int y = 0;
		boolean right = true;
		boolean up = true;
		
		for(int i= 0 ; i < sizeX;i++){
			for(int j= 0 ; j < sizeY;j++){
				tab[i][j] = false;
			}
		}
		
		for(int i= 10 ; i < 25;i++){
				tab[i][5] = true;
				tab[i][10] = true;
				tab[i][15] = true;
				tab[i][20] = true;
		}
		
		for(int i= 35 ; i < 50;i++){
				tab[i][5] = true;
				tab[i][10] = true;
				tab[i][15] = true;
				tab[i][20] = true;
		}
			
		
		
		while(true){
			if(right){
				x++;
				if(x == sizeX-1){
					right = false;
				}
			}else{
				x--;
				if(x ==0){
					right = true;
				}
			}
			
			if(up){
				y++;
				if(y == sizeY-1){
					up = false;
				}
			}else{
				y--;
				if(y ==0){
					up = true;
				}
			}
			//System.out.println("x : "+x+", y : "+y);
			if(tab[x][y]){
				//System.out.println("ligne");
				up = !up;
			}
			String tmp="";
			for(int j = 0;j<sizeY;j++){
				for(int i = 0;i<sizeX;i++){
					if(i == x && j == y){
						tmp += 'X';
					}else{
						if(!tab[i][j]){
							tmp += '.';
						}else{
							tmp += '+';
						}
					}
				}
				tmp += "\n";
			}
			System.out.print(tmp);
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			
			
			try{
			Thread.sleep(100);
			}catch(InterruptedException ex){}
		}
		
		
	}		
}
