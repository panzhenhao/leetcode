package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));  
        String str = strin.readLine(); 
        String[] para= str.split(" ");
        int n = Integer.parseInt(para[0]);
        int m = Integer.parseInt(para[1]);
        int [][] data = new int[n][n];
        for(int i=0; i<n;i++){
        	String[] temp = strin.readLine().split(" ");
        	for(int j=0; j<n; j++){
        		data[i][j] = Integer.parseInt(temp[j]);
        	}
        }
        int max = 0;
        //行
        for(int i=0; i<n;i++){
        	for(int j=0;j<n-m+1;j++){
        		int sum=0;
        		for(int k=j;k<m+j;k++){
        			sum += data[i][k];
        			if(sum>max){
        				max=sum;
        			}
        		}
        	}
        }
        //列
        for(int i=0; i<n;i++){
        	for(int j=0;j<n-m+1;j++){
        		int sum=0;
        		for(int k=j;k<m+j;k++){
        			sum += data[k][i];
        			if(sum>max){
        				max=sum;
        			}
        		}
        	}
        }
        //
        int[][] data2 = new int[2*n-1][n];
        for(int i=0; i<2*n-1; i++){
        	for(int j=0;j<n;j++){
        		if(i<n){
        			data2[i][j] = data[j][i];
        		}else{
        			data2[i][j] = data[j][i-n+1];
        		}
        	}
        		
        }
       
        for(int i=0; i<n;i++){
        	for(int j=0;j<n-m+1;j++){
        		int sum=0;
        		for(int k=j;k<m+j;k++){
        			sum += data2[i][k];
        			if(sum>max){
        				max=sum;
        			}
        		}
        	}
        }
        System.out.println(max);
        
	}
}
