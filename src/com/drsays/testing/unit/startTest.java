package com.drsays.testing.unit;

import java.util.ArrayList;
import java.util.List;

import com.drsays.testing.Chrome;
import com.drsays.testing.Firefox;
import com.drsays.testing.Safari;
import com.drsays.testing.TestCase;

public class startTest {

	List<TestCase> cases = new ArrayList<TestCase>();

	public void run() throws InterruptedException {

		addAllTestCase();

		for (TestCase c : cases) {
			c.run(new Chrome());
			Thread.sleep(5000);
			c.run(new Firefox());
			Thread.sleep(5000);
			c.run(new Safari());
			Thread.sleep(5000);
		}
	}

	public void addAllTestCase() throws InterruptedException {
		cases.add(new LoginCase());
		cases.add(new FormCase());
	}

	public static void main(String[] args) {
		startTest st = new startTest();
		try {
			st.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
