package Hackerearth;

import java.io.*;

import java.util.*;

public class CaseConvertion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			String str = sc.next();

			System.out.println(caseConversion(str));

		}

	}

	static String caseConversion(String s) {

		int n = s.length();

		StringBuilder sb = new StringBuilder();

		// first character

		char first = s.charAt(0);

		if (Character.isUpperCase(first)) {

			sb.append(Character.toLowerCase(first));

		} else {

			sb.append(first);

		}

		for (int i = 1; i < n; i++) {

			char other = s.charAt(i);

			if (Character.isUpperCase(other)) {

				sb.append('_');

				sb.append(Character.toLowerCase(other));

			} else {

				sb.append(other);

			}

		}

		return sb.toString();

	}

}
