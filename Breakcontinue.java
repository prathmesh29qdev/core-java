public class BreakContinue {
	public static void main(String[] args) {
		int num;
		for (num = 1; num <= 10; num++) {
			if (num > 7) {
				break;
			}
			if (num == 5) {
				continue;
			}
			System.out.print(" " + num);
		}
	}
}
