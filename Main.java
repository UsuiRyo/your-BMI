public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int s , t , b;
		System.out.println("身長を入力してください//");
		s = stdin.nextInt();
		System.out.println("体重を入力してください//");
		t = stdin.nextInt();
		b = t / ( s * s );
		i = 0;
		if( i < 1 ){
			System.out.println("あなたのBMI値は" + b + "です");
			i = i + 1;
		}
	}
}
