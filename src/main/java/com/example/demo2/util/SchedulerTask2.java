package com.example.demo2.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class SchedulerTask2 {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	@Scheduled(fixedRate=3000)
	private void process2(){
		System.out.println("现在时间：" + dateFormat.format(new Date()));
	}
}
