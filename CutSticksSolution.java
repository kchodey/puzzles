package Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutSticksSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfSticks = sc.nextInt();
		
		int [] sticks = new int[numberOfSticks];
		
		for(int i=0;i<numberOfSticks;i++)
			sticks[i] = sc.nextInt();
		
		int least = findLeast(sticks);
		
		System.out.println(cutSticks(sticks,least));
			
			

	}

	private static List cutSticks(int[] sticks, int least) {
		
		List finalSticks = new ArrayList();
		
		for (int i = 0; i < sticks.length; i++) {
			int temp = sticks[i] - least;
			
			if(temp > 0)finalSticks.add(temp);
		
		}
		
		return finalSticks;
	}

	private static int findLeast(int[] sticks) {
		int least = sticks[0];
		for(int i=1;i<sticks.length;i++){
			if(sticks[i] < least)
				least = sticks[i];
		}
		return least;
	}

}
