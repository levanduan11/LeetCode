package test;

public class sort {
    public static void tmp(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    private static int ex(int a,int b){

//       if(a>b)return 1;
//       else if (a<b)return -1;
//       else return 0;
        return b-a;
    }
    public static void sort1(int[] a, int lo, int hi){
        if (hi <= lo) return;
        int lt = lo, i = lo+1, gt = hi;
        int v = a[lo];
        while (i <= gt)
        {
            int cmp = ex(a[i],v);
            if (cmp < 0) tmp(a, lt++, i++);
            else if (cmp > 0) tmp(a, i, gt--);
            else i++;
        } // Now a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi].
        sort1(a, lo, lt - 1);
        sort1(a, gt + 1, hi);
    }

   private static void exch(Comparable[] a ,int i,int j){
       Comparable t = a[i]; a[i] = a[j]; a[j] = t;
   }
        private static void sort(Comparable[] a, int lo, int hi)
        { // See page 289 for public sort() that calls this method.
            if (hi <= lo) return;
            int lt = lo, i = lo+1, gt = hi;
            Comparable v = a[lo];
            while (i <= gt)
            {
                int cmp = a[i].compareTo(v);
                if (cmp < 0) exch(a, lt++, i++);
                else if (cmp > 0) exch(a, i, gt--);
                else i++;
            } // Now a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi].
            sort(a, lo, lt - 1);
            sort(a, gt + 1, hi);
        }

    public static void main(String[] args) {
        int a[]={7,3,4,2,1};
      sort1(a,0,a.length-1);
        for (int s:a
             ) {
            System.out.println(s);
        }

    }


}
