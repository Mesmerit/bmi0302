public class BmiService {
    public int calculate(int height, int weight) {
        int bmi;
        int height2 = height * height;
        bmi = weight * 100_000 / height2;  //для перевода см2 в м2 и 10 добавление 0 для последующего округления
        return bmi;

    }

}