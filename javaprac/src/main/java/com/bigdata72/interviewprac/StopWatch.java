package com.bigdata72.interviewprac;
import java.lang.Math;

public interface StopWatch {
	double PRECISION = Math.pow(10,9);
	void start();
	void stop();
	long nanoDuration();
	void reset();
	default double durationInSeconds(){
		return (double)nanoDuration()/PRECISION;
	}
}
