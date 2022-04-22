package priv.algorithm.leetcode.jianzhi;

/**
 * @author: klien.zq
 * @description: 剑指 Offer 05. 替换空格
 * @date: 2022/4/18 15:58
 */
public class JZ05 {

    public String replaceSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                s = s.substring(0, i) + "%20" + s.substring(i + 1, s.length());
            }
        }

        return s;
    }
}
