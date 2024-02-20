package com.enums;

public class EnumRunner {
	public static void main(String[] args) {
		/*
		 * java compiler by diffult add a toString
		 * System.out.println(Severity.CRITICAL);
		 */

		/*
		 * Severity[] a = Severity.values(); for (Severity sev : a) {
		 * System.out.println(sev);
		 * 
		 * }
		 */
		// Arrays.asList(Severity.values()).forEach(System.out::println);

		/*
		 * EnumSet<Severity> enumset = EnumSet.of(Severity.CRITICAL, Severity.HIGH);
		 * enumset.forEach(System.out::println);
		 */

		/*
		 * Map<Severity, String> map=new EnumMap<>(Severity.class);
		 * map.put(Severity.CRITICAL, "critical"); map.put(Severity.HIGH, "high");
		 * map.forEach((k,v)->System.out.println(k));
		 */

		System.out.println(Severity.CRITICAL.getFixinghours());
	}
}
