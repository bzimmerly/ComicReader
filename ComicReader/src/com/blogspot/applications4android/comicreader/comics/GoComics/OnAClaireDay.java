package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class OnAClaireDay extends DailyGoComicsCom {
	public OnAClaireDay() {
		super();
		mComicName = "onaclaireday";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2006, 5, 18);
	}
}
