package leetcode;
//给定一个整数数组 nums 和一个整数目标值 target，
// 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

public class 两数之和 {

        public static void main(String[] args) {
            int [] arr = {1,2,3,4};
            twoSum(arr,7);
            }

    public static int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        for(int i = 0;i < nums.length;i++){
            for (int j = i + 1;j < nums.length ;j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(i + " " +j);
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
    }



/*
思路：组合 从一个数组中选出两个元素进行求和（不考虑顺序）
用循环嵌套，外层循环遍历每个元素，内层循环起始值在外层循环的基础上加1，这样就可以使得每任意两个
加和，而不重复。
 */
