package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public String findWords(String words) {
    	char temp = words.charAt(0);
    	int num = 1;
    	StringBuilder res = new StringBuilder();
    	for(int i=1;i<words.length();i++){
    		char c = words.charAt(i);
    		if (String.valueOf(c).equals(String.valueOf(temp))) {
				num++;
			}else{
				res.append(num).append(temp);
				temp=c;
				num=1;
			}
    	}
    	res.append(num).append(temp);
		return res.toString();	   
    }

	public static void main(String[] args) throws IOException {
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));  
        String str = strin.readLine(); 
		Main solution = new Main();
		String re = solution.findWords(str);
		System.out.println(re);
	}
}
