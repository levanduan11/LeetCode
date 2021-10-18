package lesso1;

public class plusone {
    public static void main(String[] args) {
int []arr={9,9,8,9};
int b[] =plusOne1(arr);
        for (int t:b
             ) {
            System.out.println(t);
        }

    }
    public static int[] plusOne1(int[] digits) {
        // parse digits array backward
        for(int i = digits.length - 1; i >= 0; i--){
            // if it's 9 and the most significant digit
            if(digits[i] == 9 && i == 0){
                // change 9 to 0
                digits[i] = 0;
                // create a new array with size + 1
                int[] digit = new int[digits.length + 1];
                // assign 1 to the most significant digit
                digit[0] = 1;
                // copy the digits array to digit array
                for(int j = 1; j < digit.length; j++){
                    digit[j] = digits[j-1];
                }
                return digit;
            }
            // if a digit is 9, assign 0 and keep iterate
            else if(digits[i] == 9){
                digits[i] = 0;
                // increment the digit and break out of loop
            }else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }
    public static int []plus(int []arr){
        for (int i = arr.length-1; i >=0 ; i++) {
                if(i==0&&arr[i]==9){
                    arr[i]=0;
                    int newarr[] =new int[arr.length+1];
                    newarr[0]=1;
                    for (int j = 1; j <newarr.length ; j++) {
                        newarr[j]=arr[j-1];
                    }
                    return newarr;
                }
                else if(arr[i]==9){
                    arr[i]=0;
                }
                else {
                    arr[i]++;
                    break;
                }
        }
        return arr;
    }
    public static int[] plusOne(int[] digits){
int n=digits.length;
        int newarr[] =new int [digits.length+1];
        for (int i = 0; i < digits.length; i++) {
            newarr[i]=digits[i];
        }

       if(newarr[newarr.length-2]+1>=10){
            newarr[newarr.length-2]=(int)10/(digits[digits.length-1]+1);
            newarr[newarr.length-1]=digits.length-1%10;
            return newarr;
        }

            digits[digits.length-1]++;



   return digits;
    }
}
