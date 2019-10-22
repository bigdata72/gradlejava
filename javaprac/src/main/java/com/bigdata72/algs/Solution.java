package com.bigdata72.algs;

import java.util.*;

public class Solution {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public ArrayList<String> topNCompetitors(int numCompetitors,
											 int topNCompetitors,
											 List<String> competitors,
											 int numReviews,
											 List<String> reviews)
	{
		// WRITE YOUR CODE HERE
		Map<String, Integer>companyNumReviews = new HashMap<>();

		String [] companies = new String[numCompetitors];

		for(int i=0; i<numCompetitors; i++){
			companies[i] = competitors.get(i);
		}

		// find the name of the companies in the reviews
		for(String review : reviews){
			String [] s = review.split("\\s+");
			// now process the string []
			companyNumReviews = processReview(s, companies);
		}

		// display the top N competitors
		for(Map.Entry<String, Integer> entry : companyNumReviews.entrySet())
		{
			System.out.println("Key:"+entry.getKey() + "Value:"+entry.getValue());

		}
		return null;
	}
	// METHOD SIGNATURE ENDS

	private static Map<String, Integer> processReview(String [] arr, String [] companies){
		Map<String, Integer> compReviews = new HashMap<>();

		for(int i=0; i<companies.length; i++){
			for(int j=0; j <arr.length;j++){
				if(companies[i].equalsIgnoreCase(arr[j])){
					// company name found in review

					Integer value = compReviews.get(companies[i]);
					if(value == null){
						compReviews.put(companies[i], new Integer(1));
					}else{
						// value was there
						int newVal = value.intValue() + 1;
						compReviews.put(companies[i], newVal);
					}
				}
			}
		}
		return compReviews;
	}

	public static void main(String[] args) {


	}
}
