public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 60;
        double height = 1.60;
        double bmi = service.calculate(weight, height);
        System.out.printf("Индекс массы тела: %.2f\n", bmi);

    }
}
