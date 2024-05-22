package practice.datadriventesting;

public class GenerateAlphaNumericRandomTest {

	public static void main(String[] args) {
		int n=20;
		String AN_String="QWERTYUIOPASDFGHJKLZXCVBNM1234567890qwertyuiopasdfghjklzxcvbnm";//A-Z 0-9 a-z
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index =(int)(AN_String.length()*Math.random());
			sb.append(AN_String.charAt(index));
		}
		System.out.println(sb);
		

	}

}
