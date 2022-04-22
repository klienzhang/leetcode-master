package priv.algorithm.leetcode.huisu;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/21 21:35
 */
public class Solution {
    List<List<Integer>> res = new LinkedList<>();

    @Test
    public void testCase() {
        subsets(new int[]{1,2,3,4});
        System.out.println(res);
    }

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        //包含空集，从第0层开始
        backtrack(nums,track,0);

        return res;
    }

    public void backtrack(int[] nums,LinkedList<Integer> track,int start){

        res.add(new LinkedList<Integer>(track));

        //base case
        if(track.size() == nums.length){
            return;
        }
        //因为nums中没有相同的元素，所以可以直接通过start来避免重复的元素
        for(int i = start;i<nums.length;i++){
            track.add(nums[i]);
            backtrack(nums,track,i+1);
            track.removeLast();
        }
    }
}
