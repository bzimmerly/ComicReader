   
package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class OffTheMark extends DailyGoComicsCom {
	public OffTheMark() {
		super();
		mComicName = "offthemark";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2011, 4, 16);
	}
}
