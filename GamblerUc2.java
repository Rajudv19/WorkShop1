package com.BridgeLabs.WorkShop;

public class GamblerUc2{
public static void main(String[] args){
		
		int stackPerDay = 100;
		int betpGame = 1;
        
        double verify = Math.floor(Math.random() * 10) % 2;
        System.out.println(verify);
        
        if(verify == betpGame)
        	System.out.println("Gambler Won  ");
		else
			System.out.println("Gambler Loss");
    }
}
