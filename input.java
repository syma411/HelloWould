import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu{
	public static void main(String[] args) {
		String inputChar;
		inputChar = input();
		output(inputChar);
	}


	public static String input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = null;
		try{
			a = br.readLine();
			return a;
		}catch(IOException e) {
			System.out.println(e);
			return a;
		}
	}

	public static void output(String x) {
		System.out.println("アウトプットメソッドを呼び出しました");
	}
}


