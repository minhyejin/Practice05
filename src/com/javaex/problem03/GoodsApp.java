package com.javaex.problem03;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String name = "";
    	int num = 3;
       int price=0; 
       int total=0;
       int count=0;
       
       List<Goods> goodsList = new ArrayList();
       System.out.println("상품이름과"+"수량"+"을 입력해 주세요");
       
       for(int i =0; i <3; i++) {
    	  name = scan.next();
    	  price = scan.nextInt();
    	  count = scan.nextInt();
    	  Goods goods;
    	  goods=new Goods(name,price,count);
    	  goodsList.add(goods);
    	   goods.showInfo();
    	   
       }
       
       for(int i=0; i<3; i++) {
    	   Goods goods;
   
    	   goods=goodsList.get(i);
    	   total += goods.getCount();
    	   
       }
       System.out.println("모든 상품의 개수는 "+total+"입니다.");
    }

}
