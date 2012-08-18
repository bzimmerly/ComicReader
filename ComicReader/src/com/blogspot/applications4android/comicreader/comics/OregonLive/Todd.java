

package com.blogspot.applications4android.comicreader.comics.OregonLive;

import java.util.Calendar;

import com.blogspot.applications4android.comicreader.comictypes.DailyOregonlive;


public class Todd extends DailyOregonlive {
	public Todd() {
		super();
		mComicFullName = "Todd the Dinosaur";
		mComicName = "Todd";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2007, 10, 1); 
	}

	public void addException(Calendar in, int increment) {
		// exception
		int yr = in.get(Calendar.YEAR);
		int mon = in.get(Calendar.MONTH);
		int dat = in.get(Calendar.DAY_OF_MONTH);
		if(yr == 2008 && mon == 2 && (10 <= dat && dat <= 11)) {
			if(increment == 1) {
				in.set(2008, 2, 12);				
			} else if(increment == -1) {
				in.set(2004, 2, 9);				
			}			
		}
		yr = in.get(Calendar.YEAR);
		mon = in.get(Calendar.MONTH);
		dat = in.get(Calendar.DAY_OF_MONTH);
	}
}
