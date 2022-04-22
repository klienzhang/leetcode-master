package priv.algorithm.leetcode.jianzhi;

/**
 * @author: klien.zq
 * @description: 剑指 Offer 58 - II. 左旋转字符串
 * @date: 2022/4/18 17:21
 */
public class JZ58 {

    public String reverseLeftWords(String s, int n) {
        s = new StringBuffer(s).reverse().toString();
        System.out.println(s);
        int l = 0, r = s.length() - n - 1;
        char[] array = s.toCharArray();
        while (l < r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }
        System.out.println(new String(array));
        l = s.length() - n;
        r = s.length() - 1;
        while (l < r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }

        return new String(array);
    }
}
