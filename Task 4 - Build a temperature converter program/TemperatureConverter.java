import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatureInCelsius, temperatureInFahrenheit;
        System.out.println("Enter a choice (1 for Celsius or 2 for Fahrenheit) : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the temperature : ");
                temperatureInCelsius = sc.nextDouble();
                System.out.println("You have entered the temperature in °C.");
                temperatureInFahrenheit = ( ( (9.0/5.0) * temperatureInCelsius) + 32);
                System.out.println("The fahrenheit equivalent of " + temperatureInCelsius + "°C is " + temperatureInFahrenheit + "°F");
            break;

            case 2:
                System.out.println("Enter the temperature : ");
                temperatureInFahrenheit = sc.nextDouble();
                System.out.println("You have entered the temperature in °F.");
                temperatureInCelsius = ( (5.0/9.0) * (temperatureInFahrenheit-32));
                System.out.println("The celsius equivalent of " + temperatureInFahrenheit + "°F is " + temperatureInCelsius + "°C");
            break;

            default:
                System.out.println("Error....");
            break;
        }
    }
}
