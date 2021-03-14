package Train;

public class test{
	public static void main(String[] args) {
		String month="03";
		String day="11";
		for(int k=1;k<=7;k++) {
			for (int i=1;i<=7;i++) {
				if(i==k)continue;
				for(int j=1; j<=9; j++) {
					System.out.println("insert into seat (train) values ("+k+i+month+day+j+");");
				}
			}
		}
	}
}
