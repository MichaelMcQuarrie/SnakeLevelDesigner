
public class FrontEndGTerm {
	
	private GTerm guigt;
	private BackEnd backEnd;
	
	
	public FrontEndGTerm(BackEnd backEnd) {
		
		//Storing backend
		this.backEnd = backEnd;
		int iX = 50;
		int iY = 50;
		//Storing basic level array
		int[][] iNewLevelArray = new int[16][16];
		//Creating window
		this.guigt = new GTerm(1200, 900);
		
		this.guigt.setXY(0, 0);
		this.guigt.println("Snake Level Editor");
		
		iX=75;
		this.guigt.setXY(iX, 30);
		this.guigt.print("0");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("1");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("2");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("3");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("4");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("5");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("6");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("7");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("8");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("9");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("10");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("11");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("12");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("13");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("14");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("15");
		
		iY=75;
		this.guigt.setXY(30, iY);
		this.guigt.print("0");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("1");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("2");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("3");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("4");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("5");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("6");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("7");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("8");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("9");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("10");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("11");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("12");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("13");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("14");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("15");
		
		
		this.guigt.setXY(50, 50);
		this.guigt.addImageIcon("TopLeftCorner.jpg");
		//5 equals top left
		
		
		
		int iCounter = 0;
		iX = 50;
		iY = 50;
		while(iCounter <= 15) {
			if(iX == 850) {
				iX = 50;
			}
			if(iY == 850) {
				iY = 50;
			}
			
			while(iX != 850) {
				this.guigt.setXY(iX, iY);
				
				if(iX == 400 && iY == 50) {
					this.guigt.addImageIcon("HorizontalOpening.jpg");
					iNewLevelArray[(iX/50) -1][(iY/50) - 1] = 4;
					this.backEnd.getLevel().setPlayer1LocationX(iX/50);
					this.backEnd.getLevel().setPlayer1LocationY(iY/50);
				}
				else if(iX == 400 && iY == 800) {
					this.guigt.addImageIcon("HorizontalOpening.jpg");
					iNewLevelArray[(iX/50) -1][(iY/50) - 1]  = 4;
					this.backEnd.getLevel().setPlayer2LocationX(iX/50);
					this.backEnd.getLevel().setPlayer2LocationY(iY/50);
				}
				else if(iX == 800 && iY == 50) {
					this.guigt.addImageIcon("TopRightCorner.jpg");
					iNewLevelArray[(iX/50) -1][(iY/50) - 1]  = 6;
				}
				else if(iX == 800 && iY == 800) {
					this.guigt.addImageIcon("BottomRightCorner.jpg");
					iNewLevelArray[(iX/50) -1][(iY/50) - 1]  = 2;
				}
				else if(iX == 50 && iY == 800) {
					this.guigt.addImageIcon("BottomLeftCorner.jpg");
					iNewLevelArray[(iX/50) -1][(iY/50) - 1]  = 1;
				}
				else if(iX == 50 || iX == 800) {
					this.guigt.addImageIcon("VerticalLine.jpg");
					iNewLevelArray[(iX/50) -1][(iY/50) - 1]  = 7;
				}
				else if(iY == 50 || iY == 800) {
					this.guigt.addImageIcon("HorizontalLine.jpg");
					iNewLevelArray[(iX/50) -1][(iY/50) - 1]  = 3;
					}
				else {
					this.guigt.addImageIcon("Blank.jpg");
					iNewLevelArray[(iX/50) -1][(iY/50) - 1]  = 0;
				}
				
				iX += 50;
			}
			iY += 50;
			iCounter++;
			
		}
		iNewLevelArray[0][0] = 5;
		this.backEnd.getLevel().setLevelArray(iNewLevelArray);
		
		this.guigt.setXY(900, 400);
		this.guigt.addButton("Save Level", this, "saveFile");
		this.guigt.setXY(900, 500);
		this.guigt.addButton("Load Level", this, "loadFile");
		this.guigt.setXY(900, 450);
		this.guigt.addButton("Edit Tile", this, "editTile");
		
	}
	

	
	public void loadFile() {
		//Call backend load file with filepath of new file
		this.backEnd.LoadFile(this.guigt.getFilePath());
		//Refresh so new file shown
		refreshLevel();
	}
	
	public void saveFile() {
		//Call Backend save file with filepath for save
		this.backEnd.saveFile(this.guigt.setFilePath());
	}
	
	public void refreshLevel() {
		
		//Clear screen
		this.guigt.clear();
		int iX = 0;
		int iY = 0;
		this.guigt.setXY(0, 0);
		this.guigt.println("Snake Level Editor");
		
		iX=75;
		this.guigt.setXY(iX, 30);
		this.guigt.print("0");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("1");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("2");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("3");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("4");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("5");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("6");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("7");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("8");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("9");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("10");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("11");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("12");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("13");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("14");
		iX+=50;
		this.guigt.setXY(iX, 30);
		this.guigt.print("15");
		
		iY=75;
		this.guigt.setXY(30, iY);
		this.guigt.print("0");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("1");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("2");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("3");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("4");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("5");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("6");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("7");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("8");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("9");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("10");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("11");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("12");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("13");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("14");
		iY+=50;
		this.guigt.setXY(30, iY);
		this.guigt.print("15");
		
		//Counters to check against 
		int iCounter = 0;
		iX = 50;
		iY = 50;
		
		while(iCounter <= 15) {
			if(iX == 850) {
				iX = 50;
			}
			if(iY == 850) {
				iY = 50;
			}
			
			while(iX != 850) {
				this.guigt.setXY(iX, iY);
				
				//0 = blank
				if(this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 0) {
					this.guigt.addImageIcon("Blank.jpg");
					
				}
				//1 is bottom left
				else if(this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 1) {
					this.guigt.addImageIcon("BottomLeftCorner.jpg");
				
				}
				//2 is bottom right
				else if (this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 2) {
					this.guigt.addImageIcon("BottomRightCorner.jpg");
				}
				//3 is horizontal
				else if (this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 3) {
					this.guigt.addImageIcon("HorizontalLine.jpg");
				}
				//4 is horizontal opening
				else if (this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 4) {
					this.guigt.addImageIcon("HorizontalOpening.jpg");
				}
				//5 is top Left
				else if (this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 5) {
					this.guigt.addImageIcon("TopLeftCorner.jpg");
				}
				//6 is top right
				else if (this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 6) {
					this.guigt.addImageIcon("TopRightCorner.jpg");
				}
				//7 is vert line
				else if (this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 7) {
					this.guigt.addImageIcon("VerticalLine.jpg");
				}
				//8 is vert opening
				else if (this.backEnd.getLevel().getLevelArray()[(iX/50) - 1][(iY/50) - 1] == 8) {
					this.guigt.addImageIcon("VerticalOpening.jpg");
				}
				iX+=50;
			}
			iY+=50;
			iCounter++;
		}
		
		this.guigt.setXY(900, 400);
		this.guigt.addButton("Save Level", this, "saveFile");
		this.guigt.setXY(900, 500);
		this.guigt.addButton("Load Level", this, "loadFile");
		this.guigt.setXY(900, 450);
		this.guigt.addButton("Edit Tile", this, "editTile");
		
		
		
	}

	public void editTile() {
		
		int iXPosition = 0;
		int iYPosition = 0;
		int iNewTile = 0;
		iXPosition = Integer.parseInt(this.guigt.getInputString("Enter X co-ordinate"));
		iYPosition = Integer.parseInt(this.guigt.getInputString("Enter Y Axis"));
		iNewTile = Integer.parseInt(this.guigt.getInputString("0 = Blank Tile \n"
				+ " 1 = Bottom Left Corner \n" + 
				"2 =Bottom Right Corner \n" + 
				"3 = Horizontal Line \n" +
				"4 = Horizontal Opening \n" +
				"5 = Top Left Corner \n" +
				"6 = Top Right Corner \n" + 
				"7 = Vertical Line \n" +
				"8 = Vertical Opening"));
		
		this.backEnd.getLevel().changeTile(iXPosition, iYPosition, iNewTile);
		refreshLevel();
		
	}
	
}
