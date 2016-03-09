package com.epam;

import java.util.StringTokenizer;

/**
 * Created by hrinchenko on 08.03.2016.
 */
public class Main {
    public static void main(String[] args) {


        String str = "This is String, split by StringTokenizer. Created by Student:Name of Student";
for(int i =0; i<=2; i++){
    if(i==0){
        StringTokenizer s1 = new StringTokenizer(str,",");
        while (s1.hasMoreElements()){
            System.out.println(s1.nextElement());

        }
       
    }else if(i==1){
        StringTokenizer s1 = new StringTokenizer(str," ");
        while (s1.hasMoreElements()){
            System.out.println(s1.nextElement());

        }
        
    }else if(i==2){

        StringTokenizer s1 = new StringTokenizer(str,".");
        while(s1.hasMoreElements()){
            System.out.println(s1.nextElement());
        }
    }
 System.out.println("***********************");
}
    }
}
