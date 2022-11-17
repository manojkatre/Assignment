package com.assignment.day4.array;

public class duplicate_No {
    private static int duplicate_no(int no[]) {
        int n = no.length;
        //int count=0;
        for (int i=0;i<n;i++) 
       {
          for (int j=i+1;j<n;j++) 
          {
               if (no[j]==no[i])
                    return no[i];
             //count++;
          } 
          //System.out.println("count:"+count);
        }
       return -1;
        }
    public static void main(String[] args) {
       int no[] = new int[]{10, 20, 40, 20, 30};
        System.out.println(duplicate_no(no));
       }
}

