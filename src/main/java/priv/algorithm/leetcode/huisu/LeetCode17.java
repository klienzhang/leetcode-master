package priv.algorithm.leetcode.huisu;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 18:54
 */
public class LeetCode17 {

    List<String> result = new ArrayList<>();

    Map<Character, String> refer = new HashMap<Character, String>(){{
        put('1', "");
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
        put('0', "");
    }};

    public List<String> letterCombinations(String digits) {
        if (null == digits || digits == "") return new ArrayList<>();
        combine(digits, new StringBuffer(), 0);
        return result;
    }

    public void combine(String digits, StringBuffer cur, int len) {
        if (cur.length() == digits.length()) {
            result.add(cur.toString());
            return;
        }

        String text = refer.get(digits.charAt(len));
        for (int i = 0; i < text.length(); i++) {
            cur.append(text.charAt(i));
            combine(digits, cur, len + 1);
            cur.deleteCharAt(len);
        }
    }

    @Test
    public void testCase() {
        System.out.println(letterCombinations(""));
    }
}
