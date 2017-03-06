package id461_HammingDistance;

import org.junit.Test;
//汉明距离是 两个（相同长度）字 对应位 字符不同的数量
public class Solution {
    public int hammingDistance(int x,int y) {
        int z = x^y;              //先将x，y按位异或运算，得到不相同位置上为1的整数z
        int res = 0;
        while(z != 0) {            //计算整数z的二进制中1的个数，即为x和y的汉明距离
            if (z%2 == 1) {
                res++;
            }
            z = z/2;
        }
        return res;
    }
	public static void main(String[] args) {
		Solution solution = new Solution();
		int re=solution.hammingDistance(1,4);
		System.out.println(re);

	}
}