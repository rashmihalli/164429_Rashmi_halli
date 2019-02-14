package UnitTestDate;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rashmi.service.DateDifferenceProvider;
import com.rashmi.service.MyDate;

public class JunitDate {

	DateDifferenceProvider days = new DateDifferenceProvider();
	int results;
	@Test
	public void test() {
		
		results = days.getDateDifference(new MyDate(04,06,2011),new MyDate(04,06,2011));
		assertEquals(0,results);
		
		results = days.getDateDifference(new MyDate(06,04,2018),new MyDate(18,04,2018));
		assertEquals(12,results);
		
		results = days.getDateDifference(new MyDate(06,04,2011),new MyDate(18,05,2011));
		assertEquals(42,results);
		
		results = days.getDateDifference(new MyDate(06,04,2011),new MyDate(18,06,2011));
		assertEquals(73,results);
		
		results = days.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2011));
		assertEquals(256,results);
		
		
		
	}

}
