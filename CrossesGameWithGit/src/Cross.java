
public class Cross {
	private int xPosition;
	private int yPosition;
	
	public void setXPosition(int x){
		if (x>=0 && x <=3){
			xPosition = x;
		}else{
			System.out.println("Invalid x position");
		}
		
	}
	
	public void setYPosition(int y){
		if (y>=0 && y <=3){
			yPosition = y;
		}else{
			System.out.println("Invalid y position");
		}
		
	}
	
	public int getXPosition(){
		return xPosition;
	}
	
	public int getYPosition(){
		return yPosition;
	}
}
