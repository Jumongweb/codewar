import java.util.Arrays;
public class ArrayOne{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	int[] numbers = {1,2,3,4,5};
	numbers[0] = numbers[0] * numbers[0];
	numbers[1] = numbers[1] * numbers[1];
	numbers[2] = numbers[2] * numbers[2];
	numbers[3] = numbers[3] * numbers[3];
	numbers[4] = numbers[4] * numbers[4];

for (int nums = 0; nums < numbers.length; nums++){
	System.out.println(numbers[nums]);

}


}
}