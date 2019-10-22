package com.bigdata72.algs;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;
import org.hamcrest.Matchers.*;

public class SolutionTest {

	@Test
	public void topNCompetitorsTest1() {
		int numCompetitors = 6;
		int topNCompetitors = 2;
		List<String> competitors = Arrays.asList("model3","teslamotors","powerwall","rivian", "modelx","models");
		int numReviews = 6;
		List<String> reviews = Arrays.asList(
				"model3 is fun to drive",
				"model3 is a very good car",
				"Model3 is awesom",
				"modelx is the best car",
				"is rivian good ?",
				"modelx is a dream car");
		Solution soln = new Solution();
		List<String> topCompanies = soln.topNCompetitors(numCompetitors,
							topNCompetitors,
							competitors,
							numReviews,
							reviews);
		assertThat(topCompanies, contains("model3", "modelx"));
	}
}