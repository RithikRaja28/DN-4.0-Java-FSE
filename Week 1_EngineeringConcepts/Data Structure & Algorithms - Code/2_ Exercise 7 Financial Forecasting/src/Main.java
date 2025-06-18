public class Main {


    public static double calculateAverageGrowthRate(double[] pastData) {
        double totalGrowth = 0.0;

        for (int i = 1; i < pastData.length; i++) {
            double growth = (pastData[i] - pastData[i - 1]) / pastData[i - 1];
            totalGrowth += growth;
        }

        return totalGrowth / (pastData.length - 1); // average
    }
    public static double futureValue(double lastValue, double rate, int years) {
        if (years == 0) {
            return lastValue;
        }
        return futureValue(lastValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double[] pastData = {10000, 11000, 12100, 13310};

        double avgRate = calculateAverageGrowthRate(pastData);
        System.out.printf("Average Growth Rate: %.2f%%\n", avgRate * 100);

        double lastValue = pastData[pastData.length - 1];
        int futureYears = 3;
        double predicted = futureValue(lastValue, avgRate, futureYears);
        System.out.printf("Predicted value after %d years: %.2f\n", futureYears, predicted);
    }
}
