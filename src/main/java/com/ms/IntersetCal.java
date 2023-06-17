package com.ms;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class IntersetCal {

		public int civilScore() {
			return new Random().nextInt(800);
		}
		public boolean eligible(int balance) {
			 if(balance>6000) {
				 return true;
			 }else {
				 return false;
			 }
			}
		
		
		public String getIFSC(String branch) {
			
			Map<String,String> map=new HashMap<>();
			map.put("indore", "sbi0998998");
			map.put("bhopal", "icici0989");
			
			return map.get(branch);
			
		}
		public int interset(int amount,int time) {
			
			int rate =0;
			if( time>=5) {
				rate =8;
			}else if(time<0){
				throw new NegativeException();
//				return 0;
			}else {
				rate =4;
			}
			int result = (amount*time*rate)/100;
			return result;
			
		}
		
		//this is manual testing 
//	public static void main(String[] args) {
//		IntersetCal cal=new IntersetCal();
//		int res=cal.interset(10000, 4);
//		System.out.println(res);
//	}

}
