public class Main {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();

        int height = 164;
        int weight = 60;

        int bmi = bmiService.calculate(height, weight);

        double bmi2 = bmi / 10.;  // строка для округления до 1 знака после запятой

        System.out.println("Индекс массы тела: " + bmi2);
    }
}

