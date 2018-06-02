
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import java.util.Set;

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int weekday = JOptionPane.showConfirmDialog(null, "Is It A Weekday");
System.out.println(weekday);
		if (weekday == 0) {
			isWeekday = true;
		} else {
			isWeekday = false;
		}
		int vaction = JOptionPane.showConfirmDialog(null, "Is It A Vacation");
		System.out.println(vaction);
		if (vaction == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}
		if (isWeekday == true && isVacation == true) {
			JOptionPane.showMessageDialog(null, "Sleep in");
		}
		if (isWeekday == true && isVacation == false) {
			JOptionPane.showMessageDialog(null, "Get Up Lazybones");
		}
		if (isWeekday == false && isVacation == true) {
			JOptionPane.showMessageDialog(null, "Sleep In");
		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
