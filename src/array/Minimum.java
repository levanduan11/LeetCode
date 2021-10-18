package array;

public class Minimum {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for(int i = 0; i < points.length - 1; i++){
            int len1 = Math.abs(points[i][0] - points[i+1][0]);
            int len2 = Math.abs(points[i][1] - points[i+1][1]);

            time = time + Math.max(len1, len2);
        }
        return time;
    }

    public static void main(String[] args) {
        int arr[][]={{1,1},{3,4},{-1,0},{-2,2}};
        System.out.println(minTimeToVisitAllPoints(arr));
    }
}
