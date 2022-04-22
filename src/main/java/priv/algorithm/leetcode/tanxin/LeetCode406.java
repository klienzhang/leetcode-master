package priv.algorithm.leetcode.tanxin;

import org.testng.annotations.Test;

import java.util.*;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/17 22:00
 */
public class LeetCode406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] person1, int[] person2) {
                if (person1[0] != person2[0]) {
                    return person2[0] - person1[0];
                } else {
                    return person1[1] - person2[1];
                }
            }
        });
        //Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]); //也可以是lambda函数实现比较重载
        List<int[]> ans = new ArrayList<int[]>();
        for (int[] person : people) {
            ans.add(person[1], person);
            //System.out.println(person[1]);
        }
        return ans.toArray(new int[ans.size()][]);
    }

    @Test
    public void testCase() {
        System.out.println(reconstructQueue(new int[][]{{5,0},{4,0},{6,0},{3,2},{2,2},{1,4}}));

        int[][] test = new int[][]{{5,0},{4,0},{6,0},{3,2},{2,2},{1,4,5}};

        int[][] arr1= new int[][]{{16, 66, 88, 2}, {2, 3, 5}};

        PriorityQueue queue = new PriorityQueue(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        for (int[] t : test) {
            //System.out.println(t);
            System.out.println(t[0]);
            System.out.println(t[1]);

            System.out.println();
        }
    }
}
