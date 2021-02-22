package lab3;

import java.util.*;

public class Lab3 {
    static Integer Integer[]={1,2,3,4,5,6,7,8,9};
    static String String[]={"A","B","C","D","E","F","G","H","I"};
    static Double Double[]={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
    public static <K>void reverse(K b[]){
    int n =b.length-1;
        for (int i = 0; i < b.length/2; i++) {
            K u = b[i];
            b[i]= b[n];
            b[n]= u;
            n--;
        }
        System.out.println(Arrays.toString(b));
    }
    public static <L>void Integrate(L a[],L b[]){
        ArrayList<L> Integrate = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            Integrate.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            Integrate.add(b[i]);
        }
        System.out.println("Integrate this "+Arrays.toString(b)+" & "+Arrays.toString(a)+" To This "+Integrate);
    } 
    public static void main(String[] args) {
        reverse(Integer);
        reverse(String);
        reverse(Double);
        Integrate(Integer, String);
    }   
}

