import java.util.Scanner;
public class Main {

	public static void main(String[] args) { // игра в 21 
		System.out.println("Если хотите добавить 4 карту -> нажмите 1 , если не хотите -> нажмите 2 ");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int n1 = 1;
		int n2 = 21;
		if(n==1) {
			int summFirstPlayer =  getSummFromPlayer(4,1,21);
			System.out.println(summFirstPlayer);	
			System.out.println(summFirstPlayer+" из 21");		
			if(summFirstPlayer<21) {
				System.out.println("недобор");
			}
				if(summFirstPlayer>21) {
					System.out.println("перебор");
				} 
					if(summFirstPlayer==21) {
						System.out.println("Очко");
					}
			} else {
			int summSecondPlayer  = getSummSecondPlayer(3,1,21);
			System.out.println(summSecondPlayer+" из 21");		
			if(summSecondPlayer<21) {
				System.out.println("недобор");
			} else {
				if(summSecondPlayer>21) {
					System.out.println("перебор");
				} else {
					if(summSecondPlayer==21) {
						System.out.println("Очко");
					}
				}
			}
		}
	}
	public static int getSummFromPlayer(int sizeOfAray, int n1, int n2) {
		int summ = 0;
		sizeOfAray=4;
		int[] numbersAray;
		numbersAray = new int[sizeOfAray];
		for (int i = 0; i < numbersAray.length; i++) {
			numbersAray[i] = (int)((n2-n1+1)*Math.random());
			summ = summ+numbersAray[i];
		}
		return summ;	
	}
	public static int getSummSecondPlayer(int sizeOfAray, int n1, int n2) {
		int summ = 0;
		sizeOfAray=3;
		int[] numbersAray;
		numbersAray = new int[sizeOfAray];
		for (int i = 0; i < numbersAray.length; i++) {
			numbersAray[i] = (int)((n2-n1+1)*Math.random());
			summ = summ+numbersAray[i];
		}
		return summ;	
	}
}