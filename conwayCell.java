
public class conwayCell {
	
	public int x;
	public int y;
	public boolean isAlive;
	
	public conwayCell(int x, int y,boolean isAlive){
		this.x = x;
		this.y = y;
		this.isAlive = isAlive;
	}
	public boolean equals(Object conwayCell2) {
		
		return true; 
	}
	public String toString() {
		return "Constructing";
	}


	public boolean getIsAlive(){
	//	if( /* compare one object to another... Override equals to get x and y then compare.. */) {
			return isAlive; 
		//}
	}
	
}
