package hard;

import java.util.ArrayList;

public class Password {
    public static int strongPasswordChecker2(String password) {


        // first: we need to count how many types (lowercase, uppercase, digit) of characters are missing
        // second: we need to find how many repeated character set exist in the password

        int t1=0;
        int t2=0;
        int t3=0;

        int repeat=1;
        int triplet=0;

        ArrayList<Integer> repeated=new ArrayList<>(); // this will contain count of (more than 3) repeated character sets.

        int N=password.length();

        char prev='=';
        for(int i=0 ;i <N ;i++)
        {
            char c=password.charAt(i);
            if('A'<=c && c<='Z')
            {
                t1=1;
            }
            if('a'<=c && c<='z')
            {
                t2=1;
            }
            if('0'<=c && c<='9')
            {
                t3=1;
            }

            if(prev==c)
            {
                repeat++;
            }else
            {
                if(repeat>=3)repeated.add(repeat);
                repeat=1;
            }
            prev=c;


        }

        if(repeat>=3) repeated.add(repeat);
        for(int r: repeated)
        {
            triplet+=r/3;
        }

        int missting_type=3-t1-t2-t3; // the number of types missing in password


        // case 1 if the password length is less than 6
        // then you have to insert the remaining characters
        // newly inserted character should cover the missing types
        // for example if you get "aaa" then you can add three characters A,B,1 interleving with a. so repeating is not a matter in this case.
        if(N<6)
        {
            int insert= 6-N;
            return Math.max(missting_type, insert);
        }


        // case 2: you need to replace character in case you have missing type and/or repeated charcter.
        // no need to insert or delete.
        if(N>=6 && N<=20)
        {

            return Math.max(missting_type, triplet);
        }



        // case 3: the length is more than 20. You must delete at least N-20 character
        // you must delete wisely so that the number repeated trippled is minimum.
        // so you delete the character which has minimum remainder (%3). (for example, if you have 5As and 6Bs, you should remove from B, thats because if you remove from A the number of tripplets are still 1 for A, but if you remove from B then the number of tripplets is reduced to 1 from 2)

        Integer [] REPEATED=repeated.toArray(new Integer[repeated.size()]);
        int deleteno=N-20;

        //     System.out.println(repeated);


        while(deleteno>0)
        {
            int min_rem=3;
            int min_i=0;
            boolean changed=false;
            for(int i=0; i<REPEATED.length; i++)
            {
                int rem=REPEATED[i]%3;

                if(rem<min_rem && REPEATED[i]>2) // you do not need to delete a character if it becomes 2 (not a tripplet)
                {
                    min_i=i;
                    min_rem=rem;
                    changed=true;
                }
            }

            if(!changed) break;
            REPEATED[min_i]--;
            deleteno--;

        }

        triplet=0;
        for(int r: REPEATED)
        {
            // System.out.print(r+" ");
            triplet+=r/3;
        }

        int replace=Math.max(missting_type, triplet);

        return replace+(N-20);



    }

    public static int strongPasswordChecker(String password) {
        int length = password.length();
        int prob1 = Math.max(0, Math.max(6 - length, length - 20));

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        int prob2 = 3;

        int prob3 = 0;
        int repeatCount = 1;
        int p31 = 0;
        int p32 = 0;
        int p33 = 0;

        char prev = 'b';
        for (int i = 0; i < length; i++) {
            char curr = password.charAt(i);
            if (Character.isUpperCase(curr) && !hasUpper) {
                prob2--;
                hasUpper = true;
            }
            if (Character.isLowerCase(curr) && !hasLower) {
                prob2--;
                hasLower = true;
            }
            if (Character.isDigit(curr) && !hasDigit) {
                prob2--;
                hasDigit = true;
            }

            if (i > 0) {
                if (curr == prev) {
                    repeatCount++;
                } else {
                    if (repeatCount >= 3) {
                        prob3 += repeatCount / 3;
                        if (repeatCount % 3 == 0) {
                            p31++;
                        } else if (repeatCount % 3 == 1) {
                            p32++;
                        } else {
                            p33++;
                        }
                    }
                    repeatCount = 1;
                }
            }
            prev = curr;
        }
        // need to include the last batch
        if (repeatCount >= 3) {
            prob3 += repeatCount / 3;
            if (repeatCount % 3 == 0) {
                p31++;
            } else if (repeatCount % 3 == 1) {
                p32++;
            } else {
                p33++;
            }
        }
        if (length < 6) {
            return Math.max(prob1, prob2);
        } else if (length > 20) {
            int prob3ResolvedByDelete = 0;
            if (prob1 <= p31) {
                prob3ResolvedByDelete = prob1;
            } else if (prob1 <= 2 * p32 + p31) {
                prob3ResolvedByDelete = p31 + (prob1 - p31) /2;
            } else {
                prob3ResolvedByDelete = p31 + p32 + (prob1 - p31 - 2 * p32) / 3;
            }
            return prob1 + Math.max(prob2, prob3 - prob3ResolvedByDelete);
        } else {
            return Math.max(prob2, prob3);
        }
    }
    public static void main(String[] args) {
String s="aaaaaaabbbbbbccccccccccccccccc";
        System.out.println(strongPasswordChecker2(s));
    }
}
