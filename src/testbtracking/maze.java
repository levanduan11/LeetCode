package testbtracking;

public class maze {
    static int n;
    boolean validate(int sole[][],int x,int y){
        return (x>=0&&y>=0&&x<n&&y<n&&sole[x][y]==1);
    }
    boolean slove(int s[][],int x,int y,int res[][]){
        if(x==n-1&&y==n-1&&s[x][y]==1){
            res[x][y]=1;
            return true;
        }
        if(validate(s,x,y)){
            if(res[x][y]==1){
                return false;
            }
           res[x][y]=1;
            if(slove(s,x+1,y,res)){
                return true;
            }
            if(slove(s,x,y+1,res)){
                return true;
            }
            if(slove(s,x-1,y,res)){
                return true;
            }
            if(slove(s,x,y-1,res)){
                return true;
            }
            s[x][y]=0;
            return false;
        }
        return false;
    }
}
