
import java.util.Arrays;

public class ReferenceCopy {

	public static void main(String[] args) {
		int score = 200;
		
		System.out.println("This is the scores"+score);
		
		int[] scores = {200,300,400,500,600};
		
		System.out.println("The team scores is "+scores);
System.out.println("this is the decimal of the hexa-decimal code"+scores.hashCode());
System.out.println("The team scores are: " + Arrays.toString(scores));

int[] teamscores = scores;
System.out.println(teamscores.hashCode());
System.out.println(Arrays.toString(teamscores));
teamscores[0] = 99;
System.out.println(Arrays.toString(teamscores));
}
}
