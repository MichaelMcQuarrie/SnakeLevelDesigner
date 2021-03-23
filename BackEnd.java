import java.io.*;


public class BackEnd {
	
	//All Arrays and variables
	private Level currentLevel;
	
	
	public BackEnd() {
		
		// Object member variable declarations must be initialised before doing anything else.
		//Making Array sizes
		currentLevel = new Level();
		
		
		
	}
	
	public Level getLevel() {
		return currentLevel;
	}

	
	public void LoadFile(String sFilePath) {
		
		// The code below must be placed inside a method
		
		BufferedReader inFile = null;
		int[][] iNewArray = new int[16][16];
		int iYArray = 0;
		String[] sFields;

		try {
			// Read file with filepath given
			inFile = new BufferedReader(new FileReader(sFilePath));

			String currLine = inFile.readLine();

			while (currLine != null) { // Add to the array and create recipes
				
				sFields = currLine.split(",");

				iNewArray[iYArray][0] = Integer.parseInt(sFields[0]);
				iNewArray[iYArray][1] = Integer.parseInt(sFields[1]);
				iNewArray[iYArray][2] = Integer.parseInt(sFields[2]);
				iNewArray[iYArray][3] = Integer.parseInt(sFields[3]);
				iNewArray[iYArray][4] = Integer.parseInt(sFields[4]);
				iNewArray[iYArray][5] = Integer.parseInt(sFields[5]);
				iNewArray[iYArray][6] = Integer.parseInt(sFields[6]);
				iNewArray[iYArray][7] = Integer.parseInt(sFields[7]);
				iNewArray[iYArray][8] = Integer.parseInt(sFields[8]);
				iNewArray[iYArray][9] = Integer.parseInt(sFields[9]);
				iNewArray[iYArray][10] = Integer.parseInt(sFields[10]);
				iNewArray[iYArray][11] = Integer.parseInt(sFields[11]);
				iNewArray[iYArray][12] = Integer.parseInt(sFields[12]);
				iNewArray[iYArray][13] = Integer.parseInt(sFields[13]);
				iNewArray[iYArray][14] = Integer.parseInt(sFields[14]);
				iNewArray[iYArray][15] = Integer.parseInt(sFields[15]);
				//createNewRecipe(sFields()[0], getFieldsArray()[1].toUpperCase().charAt(0),
						//Integer.parseInt(getFieldsArray()[2]), Boolean.parseBoolean(getFieldsArray()[3]));
				iYArray++;

				// Add to current Recipes 
				currLine = inFile.readLine();
				
			}
			inFile.close();
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		this.currentLevel.setLevelArray(iNewArray);
		
		
	}
	
	public void saveFile(String sFilepath) {
		
		// Strings and arrayLength is its length.
		BufferedWriter outFile = null;
		try {
			outFile = new BufferedWriter(new FileWriter(sFilepath + ".txt"));
			
			int iXArrayLocation = 0;
			int iYArrayLocation = 0;
			while (iXArrayLocation < getLevel().getLevelArray().length){
				while (iYArrayLocation < getLevel().getLevelArray().length){
					if(iYArrayLocation == getLevel().getLevelArray().length - 1) {
						outFile.write(getLevel().getLevelArray()[iXArrayLocation][iYArrayLocation] + "\n");
					}
					else {
						outFile.write(getLevel().getLevelArray()[iXArrayLocation][iYArrayLocation] + ",");
					}
					
					iYArrayLocation++;
				}
				iYArrayLocation = 0;
				iXArrayLocation++;
			}
			outFile.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}

