package com.anuj.dsimpl.other;

public class CompareVersionNums {

	public static void main(String[] args) {
		String v1 = "2.12.11.09";
		String v2 = "2.12.11.09";

		String[] v1Split = v1.split("\\.");
		String[] v2Split = v2.split("\\.");

		if (v1Split.length != v2Split.length) {
			System.out.println("Version Numbers not of same length and not equal");
			return;
		} else {
			for (int i = 0, j = 0; i < v1Split.length; i++, j++) {
				if (!v1Split[i].equals(v2Split[j])) {
					System.out.println("Version Numbers not equal");
					return;
				}
			}
		}
		System.out.println("Version Numbers are equal");
	}
}
