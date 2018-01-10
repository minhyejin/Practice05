package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	ArrayList<Friend> arr = new ArrayList<Friend>();
    	for(int i =0; i<3; i++) {
    		String info = scan.nextLine();
    		
    		String [] friend = info.split(" ");
    		Friend fr = new Friend();
    		fr.setName(friend[0]);
    		fr.setHp(friend[1]);
    		fr.setSchool(friend[2]);
    		
    		arr.add(fr);
    		
    		
    	}for(Friend fr : arr) {
    		fr.showInfo();
    	}
    	
       
    }

}
