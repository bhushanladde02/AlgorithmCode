package Code;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Accepted
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
      int p[]=new int[2];
      for (int i=0;i<nums.length;i++){
          int temp=nums[i];
          for(int j=i+1;j<nums.length;j++){
             if(target==(temp+nums[j])){
                 p[0]=i;
                 p[1]=j;
                 break;
             }
             
          }
      }
      return p;
  }
}