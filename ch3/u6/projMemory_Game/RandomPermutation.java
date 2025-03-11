// Assignment Name: 'Project 3.6.5 Memory Game'
import java.util.Random;
import java.util.ArrayList;

public class RandomPermutation {
	public static void main(String[] args) {
		final int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		next(p);
	}
	public static void next(int[] array) {
		Random rand = new Random();
		int[] r = new int[10]; // ourArray
		for (int i = 0; i < r.length; i++) {
			int index = rand.nextInt(r.length);
			int temp = r[9 - i];
			r[index] = temp;
			r[9 - i] = r[index];
		}
		System.out.println(r);
	}
	public static void next(int[] arr, int length) { // The funny ain't ready yet, come back later :(
		ArrayList<Integer> temp = new ArrayList<Integer>(); // ourArray
		Random rand = new Random();
		int[] r = new int[length];
		for (int i = 0; i < length; i++) {
			int index = rand.nextInt(length - 1);
			temp.add(arr[index]);
		}
		System.out.println(temp);
	}
}
