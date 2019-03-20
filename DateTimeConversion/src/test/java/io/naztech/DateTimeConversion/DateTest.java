package io.naztech.DateTimeConversion;

import org.junit.Test;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

import junit.framework.TestCase;

public class DateTest extends TestCase {

	@Test
	public void testCompareTo() {
		DateTimeConversion dt = new DateTimeConversion();
		Date date = new Date(2019, 0, 17,4,4,2);
		
		
		//Date to localdate
		
		LocalDate lt = dt.date_to_localdate(date);
		LocalDate lt2 = LocalDate.of(2019, Month.JANUARY, 17);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
		String formattedString = lt.format(formatter);
		String formattedString2 = lt2.format(formatter);

		//System.out.println(formattedString2);
		//System.out.println(formattedString);
		assertEquals(formattedString2, formattedString);
		
		
		
		
		
		//date_to_ZonedDateTime
		ZonedDateTime zn=dt.date_to_ZonedDateTime(date);
		ZonedDateTime zn2=ZonedDateTime.of(2019, 1, 17, 3, 38, 4, 1, ZoneId.systemDefault());
		
		String formattedString3 = zn.format(formatter);
		String formattedString4 = zn2.format(formatter);
		assertEquals(formattedString4, formattedString3);
		
		
		
		
		
		//LocalDate calender_to_localdate()
		
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 17, 03, 45, 20);
		LocalDate lt3 = dt.calender_to_localdate(c);
		String formattedString5 = lt3.format(formatter);
		LocalDate lt4 = LocalDate.of(2019, Month.JANUARY, 17);
		String formattedString6 = lt4.format(formatter);
		
		assertEquals(formattedString6, formattedString5);
		
		
		
		
		
		//LocalDate date_to_Localdatetime()
		LocalDateTime ltd=dt.date_to_Localdatetime(date) ;
		String formattedString7 = ltd.format(formatter);
		LocalDateTime ltd2=LocalDateTime.of(2019, Month.JANUARY, 17, 3, 54);
		String formattedString8 = ltd2.format(formatter);
		//System.out.println(formattedString7);
		//System.out.println(formattedString8);
		assertEquals(formattedString8, formattedString7);
		
		
		
		
		
		//Localdatetime_to_Localtime()
		
		LocalTime lt11=dt.Localdatetime_to_Localtime(date);
		LocalTime lt12=LocalTime.of(4, 4);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm");
		String formattedString9=lt11.format(formatter2);
		String formattedString10=lt12.format(formatter2);
		assertEquals(formattedString10, formattedString9);
	
		
		
		//Localdatetime_to_zoneOffSet()
		LocalDateTime ldt=LocalDateTime.of(2019, Month.JANUARY, 17, 3,54);
		ZoneOffset zot=dt.Localdatetime_to_zoneOffSet(ldt);
		ZoneOffset zot2=ZoneOffset.of("+06:00");
		assertEquals(zot2, zot);
		
		
		
		//zoneOffSet_to_OffsetDateTime()
	    OffsetDateTime off =OffsetDateTime.now();
		ZoneOffset znn=ZoneOffset.of("+06:00");
		OffsetDateTime off2=dt.zoneOffSet_to_OffsetDateTime(znn);
		//System.out.println(off);
		//System.out.println(off2);
		assertEquals(off2.format(formatter), off.format(formatter));
		
		
		
		
		//OffsetDateTime_To_OffsetTime
		OffsetDateTime off3=OffsetDateTime.of(2019, 1, 17, 16, 42, 46, 936,ZoneOffset.UTC);
		
		OffsetTime off4=dt.OffsetDateTime_To_OffsetTime(off3);
		//System.out.println(off4);
		OffsetTime off5=OffsetTime.of(16, 42, 46, 936,ZoneOffset.UTC);
		//System.out.println(off5);
		assertEquals(off5,off4);
		
		
		
		//OffsetDateTime_To_zonedDateTime
		OffsetDateTime off66=OffsetDateTime.of(2019, 1, 17, 16, 42, 46, 936,ZoneOffset.UTC);
		ZonedDateTime zdt=ZonedDateTime.of(2019, 1, 17, 16, 42, 46, 936,ZoneOffset.UTC);
		ZonedDateTime zdt2=dt.OffsetDateTime_To_zonedDateTime(off66);
		assertEquals(zdt2,zdt);
		
		//zoneoffset to offsettime
		
		ZoneOffset zoneOffSet = ZoneOffset.of("+06:00");
		OffsetTime time=dt.zoneOffSetToOffsetTime(zoneOffSet);
		OffsetTime off77=OffsetTime.of(17, 7, 46, 936,ZoneOffset.UTC);
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("hh");
		assertEquals(time.format(formatter3),off77.format(formatter3));
              
		
	}

}
