public class problem2 {
	public static void main(String[] args) {
		int[] cookie = {2, 4, 6, 1};
		int[] pokemon = {1, 3, 1, 8};
		int[] a = yike(pokemon,cookie);
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
		}
	}
	private static int[] yike(int[] tom, int[] jerry) {
			int[] yikes = new int[Math.max(tom.length, jerry.length)];
			for (int i = 0; i < yikes.length; i++) {
				if (i < tom.length)
					yikes[i] += tom[i];
				if (i < jerry.length)
					yikes[i] += jerry[i];
			}
			return yikes;
			
	}
}