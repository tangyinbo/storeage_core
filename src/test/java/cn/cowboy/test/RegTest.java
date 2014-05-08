package cn.cowboy.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {
	public static void main(String[] args) {
		String reg="\\d{4}(-\\d{1,2}){2}\\s(\\d{1,2}\\:)+\\d{1,2}(\\w+)";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher("2012-12-12 12:12sadfasf");
		System.out.println(m.find());
		int i=0;
		
			System.out.println(m.group(i++));
			System.out.println(m.group(i++));
			System.out.println(m.group(i++));
			System.out.println(m.group(i++));
/*		System.out.println(m.find());
		System.out.println(m.groupCount());*/

	}
}
