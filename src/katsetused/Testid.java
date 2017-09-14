package katsetused;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Testid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap<String, int[]> myHM = new HashMap<String, int[]>();
//		Map<String, int[]> myHM = new HashMap();
//		
//		int[] myArr1 = new int[3];
//		myArr1[0] = 1;
//		myArr1[1] = 2;
//		myArr1[2] = 3;
//		
//		int[] myArr2 = new int[3];
//		myArr2[0] = 4;
//		myArr2[1] = 5;
//		myArr2[2] = 6;
//		
//		int[] myArr3 = new int[3];
//		myArr3[0] = 7;
//		myArr3[1] = 8;
//		myArr3[2] = 9;
//		
//		myHM.put("a", myArr1);
//		myHM.put("B", myArr2);
//		myHM.put("C", myArr3);
//		
//		for (Entry<String, int[]> entry : myHM.entrySet()){
//			System.out.println(entry.getKey() + " - " + Arrays.toString(entry.getValue()));
//		}
//		for (Entry<String, int[]> entry2 : myHM.entrySet()){
//			System.out.println(entry2.getKey() + " - " + entry2.getValue()[0]);
//		}
//		
//		String[] myArr4 = new String[4];
//		
//		myArr4[0] = "Tere!";
//		myArr4[1] = "See";
//		myArr4[2] = "on";
//		myArr4[3] = "lause.";
//		
//		System.out.println(Arrays.toString(myArr4));
//		
//		String lause = null;
//		System.out.println(lause);
//		for (int i = 0; i < myArr4.length; i++){
//			lause += " " + myArr4[i];
////			System.out.println(myArr4[i]);
////			System.out.println(lause);
//		}
//		System.out.println(lause);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		String[][] myArr5 = new String[2][4];
		myArr5[0][0] = "kohal_0_ja_0="+date;
		myArr5[0][1] = "kohal_0_ja_1=sadsabdb";
		myArr5[1][0] = "kohal_1_ja_0="+date;
		myArr5[1][1] = "kohal_1_aj_1=tyhi";
		
		String uri = "http://tao-andreasp:8888/UMapServer/DoGis?LAYERS=EKAT01";
		for (int i = 0; i < myArr5.length; i++){
			for (int j = 0; j < myArr5.length; j++){
				System.out.println(myArr5[i][j]);
				uri += "&"+myArr5[i][j];
			}
			
		}
		System.out.println(uri);
	}

}
