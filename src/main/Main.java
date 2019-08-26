package main;

public class Main {
	public static void main(String[] args) {
		String stringClassLaObject = "Divyansh";
		boolean boolVariable = stringClassLaObject.equals("Hello");
		int l = stringClassLaObject.length();
		System.out.println(l);
		char[] individualCharacters = stringClassLaObject.toCharArray();
		char c = stringClassLaObject.charAt(0);
		stringClassLaObject.concat(" BHardwaj");
		stringClassLaObject.indexOf('a');
		stringClassLaObject.isEmpty();
		String[] s = stringClassLaObject.split(" ");
	}
}
