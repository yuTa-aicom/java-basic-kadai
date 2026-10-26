package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice(){
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		System.out.println(input);
		
		if(input.equals("p")) {
			System.out.print("自分の手はパー,");
		}else if(input.equals("r")) {
				System.out.print("自分の手はグー,");
		}else if(input.equals("s")) {
				System.out.print("自分の手はチョキ,");
		}else {
			System.out.println("有効な値ではありません。");
		}
		scanner.close();
		return input;
		
	}
	
	public String getRandom() {
		String getArray[] = {"グー", "チョキ", "パー"};
		int cpChoice = (int)Math.floor(Math.random() * 3);
		System.out.println("対戦相手の手は" + getArray[cpChoice]);
		return getArray[cpChoice];
	
	}
	
	
	public void playGame() {
		String my = getMyChoice();
		String cp = getRandom();
		
		if(my.equals("p") && cp.equals("パー")) {
			System.out.println("あいこです");
		}else if(my.equals("p") && cp.equals("グー")) {
			System.out.println("自分の勝ちです");
		}else if(my.equals("p") && cp.equals("チョキ")){
			System.out.println("自分の負けです");
		}else if(my.equals("r") && cp.equals("チョキ")) {
			System.out.println("自分の勝ちです");
		}else if(my.equals("r") && cp.equals("パー")) {
			System.out.println("自分の負けです");
		}else if(my.equals("s") && cp.equals("パー")) {
			System.out.println("自分の勝ちです");
		}else if(my.equals("s") && cp.equals("グー")) {
			System.out.println("自分の負けです");
		}else if(my.equals("r") && cp.equals("グー")) {
			System.out.println("あいこです");
		}else if(my.equals("s") && cp.equals("チョキ")) {
			System.out.println("あいこです");
		}
	}
		
}