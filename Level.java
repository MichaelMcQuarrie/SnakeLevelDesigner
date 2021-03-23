
public class Level {

	private int [][] iLevelArray;
	private int iPlayer1StartLocationX;
	private int iPlayer2StartLocationX;
	private int iPlayer1StartLocationY;
	private int iPlayer2StartLocationY;

	
	public Level() {
		// TODO Auto-generated constructor stub
		this.iLevelArray = new int [16][16];
		
	}
	
	//Recipe Name Getter and setter
	public int[][] getLevelArray() {
		
		return this.iLevelArray;
	}
	
	public void setLevelArray(int[][] iNewLevelArray) {
		this.iLevelArray = iNewLevelArray;
	}
	//X axis location
	public int getPlayer1LocationX() {
		return this.iPlayer1StartLocationX;
	}
	public void setPlayer1LocationX(int iLocation) {
		this.iPlayer1StartLocationX = iLocation;
	}
	public int getPlayer2LocationX() {
		return this.iPlayer2StartLocationX;
	}
	public void setPlayer2LocationX(int iLocation) {
		this.iPlayer2StartLocationX = iLocation;
	}
	//Y axis Locations
	public int getPlayer1LocationY() {
		return this.iPlayer1StartLocationY;
	}
	public void setPlayer1LocationY(int iLocation) {
		this.iPlayer1StartLocationY = iLocation;
	}
	public int getPlayer2LocationY() {
		return this.iPlayer2StartLocationY;
	}
	public void setPlayer2LocationY(int iLocation) {
		this.iPlayer2StartLocationY = iLocation;
	}
	
	public void changeTile(int iX, int iY, int iTile) {
		this.iLevelArray[iX][iY] = iTile;
	}
		

}
