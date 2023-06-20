package com.ms;

public class Tickets {
	
		
	public int MaxDtSolveTickets(String prioprity) {
			
			if(prioprity.equalsIgnoreCase("high")) {
				return 2;
			}else if(prioprity.equalsIgnoreCase("medium")) {
				return 4;
			}else if(prioprity.equalsIgnoreCase("low")) {
				return 6;
			}else {
				return 8;
			}
			
	}
}
