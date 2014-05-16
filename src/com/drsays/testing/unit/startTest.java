package com.drsays.testing.unit;

import com.drsays.testing.Chrome;
import com.drsays.testing.Firefox;
import com.drsays.testing.Safari;

public class startTest {

	public void run() throws InterruptedException {
		new LoginCase().run(new Chrome());
		Thread.sleep(5000);
		new LoginCase().run(new Firefox());
		Thread.sleep(5000);
		new FormCase().run(new Chrome());
		Thread.sleep(5000);
		new FormCase().run(new Firefox());
		Thread.sleep(5000);
		new FormCase().run(new Safari());
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
