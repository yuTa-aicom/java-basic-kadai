package kadai_021;
import java.util.HashMap;


public class Dictionary_Chapter21 {
	//public static void main(String[] args) {
	public void SearchDic(String[] Array) {
		
		HashMap<String, String> dicMap = new HashMap<String, String>();
	
		dicMap.put("apple", "りんご");
		dicMap.put("peach", "桃");
		dicMap.put("banana", "バナナ");
		dicMap.put("lemon", "レモン");
		dicMap.put("pear", "梨");
		dicMap.put("kiwi", "キウィ");
		dicMap.put("strawberry", "いちご");
		dicMap.put("grape", "ぶどう");
		dicMap.put("muscat", "マスカット");
		dicMap.put("cherry", "さくらんぼ");
	
		for(int i = 0; i < dicMap.size(); i++) {
			
			System.out.println(dicMap.get(Array[i]));
			
		}
	}
}
