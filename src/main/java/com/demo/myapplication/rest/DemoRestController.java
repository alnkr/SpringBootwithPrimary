/**
 * 
 */
package com.demo.myapplication.rest;

import org.springframework.web.bind.annotation.RestController;

import com.demo.myapplication.api.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Demo Rest Controller class for understanding the Constructor Injection.
 */
@RestController
public class DemoRestController {

	private Coach Coach;

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return Coach.dailyWorkout();
	}

	// Though FootballCoach is marked as Primary, Since the Qualifier contains
	// trackCoach, that gets high priority and TrackCoach instance would be
	// injected.
	@Autowired
	public DemoRestController(@Qualifier("trackCoach") Coach coach) {
		Coach = coach;
	}

}
