package asignment;

public class Arraydup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str= {"Java","Pyhton","cpp","Java"};
		int len=str.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
			if(str[i].equalsIgnoreCase(str[j])) {
				System.out.println("Duplicate in array is "+str[i]);
			}
			else
				System.out.println("No duplicates");
		}
		}
	}

}
