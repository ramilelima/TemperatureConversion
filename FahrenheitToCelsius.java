import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double weatherCesius;

		System.out.println("Enter a degree in Celsius:");
		weatherCesius = input.nextDouble();

		double result = celsiusToFahrenheit(weatherCesius);
		System.out.println("This degree in fahrenheit is: " + result);

		double weatherFahrenteit;

		System.out.println("Enter a degree in Fahrenheit:");
		weatherFahrenteit = input.nextDouble();

		double result2 = fahrenheitToCesius(weatherFahrenteit);
		System.out.println("This degree in Celsius is: " + result2);

	}

	public static double celsiusToFahrenheit(double cesius) {

		double result;
		result = (9.0 / 5 * cesius) + 32;

		return result;
	}

	public static double fahrenheitToCesius(double fahrenheit) {

		double result2;
		result2 = (fahrenheit - 32) * (5.0 / 9);

		return result2;

	}
}