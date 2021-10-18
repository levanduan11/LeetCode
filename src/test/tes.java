package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class tes {
    public static void a(String s){
     String ns[]=new String[s.length()];

     int n=s.length();
        for (int i = 0; i < s.length(); i++) {
            ns[i]=s.substring(i,n);
        }


        Arrays.sort(ns);
        for (String a:ns
             ) {
            System.out.println(a);
        }
    }
static int gcd(int a,int b){
    if (b == 0) return a;
    return gcd(b, a % b);
}
    public static void main(String[] args) {
      //  ArrayList
      //  LinkedList
   TreeMap<Integer, Integer>f=new TreeMap<>();
        f.put(1,5);
        f.put(2,4);
        f.put(3,3);
        f.put(4,2);
       // System.out.println(f);
        f.entrySet();



//Stack
        //PriorityQueue
       // TreeSet
       //  HashMap
        //HashSet
       //Hashtable

File file=new File("C:\\Users\\user\\OneDrive\\Máy tính\\love.txt");
if(file.isFile()){
    System.out.println(5);
}
    }
}
