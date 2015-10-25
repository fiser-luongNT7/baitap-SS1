import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortArray {
	public static void main(String args[]) throws FileNotFoundException {
		FileInputStream file = new FileInputStream("C:/FisJava/NguyenThiLuong_Week2/Text1.txt");
		Scanner scanner = new Scanner(file);
		
        String lengthOfArray = scanner.nextLine();
		int n = Integer.parseInt(lengthOfArray);
		String temp = scanner.nextLine();
		scanner.close();
		String [] item = temp.split(" "); //tach chuoi khi gap dau cach
		int[] Array = new int[n];
		
		for(int i=0; i<n; i++){
			Array[i] = Integer.parseInt(item[i]);
		}
		
		// sap xep theo thu tu tang dan
		for(int i=0; i<n; i++){
			for(int j=i;j<n; j++){
				if(Array[i]>Array[j]){
					int a = Array[i];
					Array[i]=Array[j];
					Array[j] = a;
				}
			}
		}
		int Min = Array[0];
		int Max = Array[n-1];
		
		//in ra ket qua
		System.out.println(Max + "\t" + Min);
		for(int i=0; i<n; i++){
			System.out.print(Array[i] + "\t");
		}
		System.out.println();
		for(int i=n-1; i>=0; i--){
			System.out.print(Array[i] + "\t");
		}
		System.out.println();
	}
}
/**
* tim gia tri lon nhat, nho nhat cua day so
* sap xep theo thu tu tang dan, giam dan
* du lieu dau vao dong thu nhat gom so n, dong thu 2 gom day so co n chu so
* ket qua dong thu 1 gom GTLN va GTNN
* dong thu 2 day sap xep theo thu tu tang dan
* dong thu 3 sap xep tu giam dan
*/