package id500_KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findWords(String[] words) {
    	String[] keyboards = {"qwertyuiop","asdfghjkl","zxcvbnm"};
    	List<String> res = new ArrayList<String>();
    	for (String word : words) {
			for(String keyboard : keyboards){ 
				for (int i = 0; i < word.length(); i++) {
					if(keyboard.contains(String.valueOf(word.charAt(i)))||keyboard.contains(String.valueOf(word.charAt(i)).toLowerCase())){
						if (i==word.length()-1) {
							res.add(word);
						}
					}
					else{
						break;
					}
				}
			}
		}
		return res.toArray(new String[0]);    
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] words = {"Hello","Alaska","Dad","Peace"};
		String[] re = solution.findWords(words);
		for (int i = 0; i < re.length; i++) {
			System.out.println(re[i]);
		}
	}
}
