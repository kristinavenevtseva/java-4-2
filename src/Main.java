public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 105;
        float height = 1.87f;
        float bmi = service.calculate(weight,height);
        System.out.println(bmi);
    }
}
