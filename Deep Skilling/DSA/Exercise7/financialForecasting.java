package Exercise7;

class Forecast {

    double futureValue(double presentValue,
                       double growthRate,
                       int years) {

        if (years == 0) {

            return presentValue;

        }

        return futureValue(
                presentValue * (1 + growthRate),
                growthRate,
                years - 1);

    }
}
public class financialForecasting {

    public static void main(String[] args) {

        Forecast forecast = new Forecast();

        double result =
                forecast.futureValue(
                        1000,
                        0.10,
                        3);

        System.out.println(
                "Future Value = " + result);

    }
}