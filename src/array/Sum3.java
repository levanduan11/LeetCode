package array;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum7(int[] nums) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                continue;
            } else {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                } else {
                    int left = i + 1;
                    int right = nums.length - 1;
                    int temp = 0 - nums[i];
                    while (left < right) {
                        if (left > i + 1 && nums[left] == nums[left - 1]) {
                            left++;
                            continue;
                        }
                        if (nums[left] + nums[right] == temp) {
                            List<Integer> ans = new LinkedList<Integer>();
                            ans.add(nums[i]);
                            ans.add(nums[left]);
                            ans.add(nums[right]);
                            res.add(ans);
                            left++;
                            right--;
                        } else if (nums[left] + nums[right] < temp) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
        }
        return res;
    }
    public static List<List<Integer>>threesum(int []sum){
        List<List<Integer>>res = new ArrayList<>();
        Arrays.sort(sum);
        for (int i = 0; i+2 < sum.length; i++) {
            if(i>0&&sum[i]==sum[i-1])continue;//prevent duplicates;


            int j=i+1;int k=sum.length-1;
            while (j<k){
                if(sum[j]+sum[k]+sum[i]==0){
                    res.add(Arrays.asList(sum[i],sum[j],sum[k]));
                    j++;
                    k--;
                    while (j<k&&sum[j]==sum[j-1])j++;
                    while (j<k&&sum[k]==sum[k+1])k--;
                }else if(sum[j]+sum[k]+sum[i]>0){
                    k--;
                }else {
                    j++;
                }
            }
        }
        return res;
    }
    public static boolean check(List<Integer>l1,List<Integer>l2){
        Collections.sort(l1);
        Collections.sort(l2);

        for (int i = 0; i < l1.size(); i++) {
            if(l1.get(i)!=l2.get(i))return false;
        }
     return true;
    }
    public static void t(List<List<Integer>>list){
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list.get(i));
        }
    }
    public static void check2(List<List<Integer>>list){
        t(list);

        Map<List<Integer>,Integer>map=new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
          map.put(list.get(i),1);
        }
    }
    public static Map<Integer, List<Integer>> reduce(List<List<Integer>>list){
  Map<Integer,List<Integer>>map=new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
    map.put(i,list.get(i));

       // if(check())
        }
return map;
    }
   public static void checkall(List<List<Integer>>list){
        int cout=0;
       int i=0;
       int j=list.size()-1;
       for (i = 0; i <list.size() ; i++) {
           while (i<j){
               if(check(list.get(i),list.get(j)))list.remove(j);
               j--;
           }

           j=list.size()-1;
       }
    }
    public static   List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;



            List<List<Integer>>res=new ArrayList<>();
        if(n==1||n==0||n==2) return res ;

        for (int i = 0; i < nums.length-2; i++) {

         List<Integer>tmP=new ArrayList<>();

            for (int j = i+1; j < nums.length-1; j++) {

                for (int k = j+1; k < nums.length; k++) {
                  if(nums[i]+nums[j]+nums[k]==0){
                      tmP.add(nums[i]);
                      tmP.add(nums[j]);
                      tmP.add(nums[k]);

                      res.add(tmP);


                  }
                     tmP=new ArrayList<>();

                }
            }

        }
checkall(res);
        return res;
    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};

        threeSum(arr);

        List<List<Integer>>l=threesum(arr);
        Map<Integer,List<Integer>>map=reduce(l);



        for (List kk:l
             ) {
            System.out.println(kk);
        }
        List<Integer>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();

       // System.out.println(check(list,list1));

    }

}
