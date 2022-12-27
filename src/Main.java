public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90; // вес в кг
        int height = 180; // рост в см
        int indexMassBody = service.calculate(weight, height);
        System.out.println(indexMassBody);
    }
}
