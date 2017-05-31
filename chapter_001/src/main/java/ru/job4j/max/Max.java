package ru.job4j.max;

public class Max {
	public int larger;
	
	public int max(int first, int second) {
		int larger = first > second ? first : second;
		return larger;
	}
	
}