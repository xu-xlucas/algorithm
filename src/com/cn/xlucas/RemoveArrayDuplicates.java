package com.cn.xlucas;

/**
 * @描述:
 *      1、背景是剔除有序整型数组中重复的值。需要基于原有数组进行操作。
 * @解题思路：
 *      1、首先数组是有序的，那么相同的数字是连续在一起的
 *      2、不能新开辟空间，只能在现有的数组上面移动，那么只能使用覆盖活着remove的操作
 *      3、使用覆盖：定义2个数组的下标。left和right。
 *                 1、当left的对应的值不等于right对应的值，则left和right都加1
 *                 2、当left的对应的值等于right对应的值，则left不变right加1在进行比对
 * @author：xluxas
 * @date:2021-11-10
 * @version:0.1
 */

public class RemoveArrayDuplicates {
    //入口函数
    public static void main(String args[]) {
        int[] A = {1, 1,2,2,3,3,3,4,5,6,7,7,8,8,9,9,11};
        System.out.print(new RemoveArrayDuplicates().removedup(A));
    }
    //定义方法

    /**
     * @param nums 数组
     * @return：返回数组的长度
     */
    public int removedup(int[] nums) {
        //如果是空数组直接返回0
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //定义2个指针
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return ++left;

    }

}
