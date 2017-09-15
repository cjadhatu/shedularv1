package com.java.main;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;




@Component
public class Scheduler {
	
	
	 @Scheduled(cron = "5 * * * * *")
	    public void branchScheduled(){
	       System.out.println(" #1 branch Scheduler is running"+new Date());
	    }
	 
	 @Scheduled(cron = "30 * * * * *")
	    public void countryScheduled(){
	       System.out.println("#2 country Scheduler is running"+new Date());
	    }
	 
	 @Scheduled(cron = "50 * * * * *")
	    public void regionScheduled(){
	       System.out.println("#3 region Scheduler is running"+new Date());
	    }
	 /*
	 @Scheduled(cron = "0 20 12 * * *")
	    public void subregionScheduled(){
	       System.out.println("subregion Scheduler is running"+new Date());
	    }
	 @Scheduled(cron = "0 30 12 * * *")
	    public void dataPolling(){
	       System.out.println("dataPolling Scheduler is running"+new Date());
	    }
*/
	 
}


