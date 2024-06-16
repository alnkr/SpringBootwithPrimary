/**
 * 
 */
package com.demo.myapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.demo.myapplication.api.Coach;

/**
 * 
 */
@Component
public class TrackCoach implements Coach {

	@Value("${coach.name}")
	private String coachName;
	
	@Value("${coach.team}")
	private String teamName;
	
	@Override
	public String dailyWorkout() {
		return "Hi "+teamName+" team, Run a hard 5k ";
	}

}
