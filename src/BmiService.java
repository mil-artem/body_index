public class BmiService {
    public int calculate(int weight, int height) {
        int indexMassBody = weight * 10000 / (height * height);
        return indexMassBody;
    }
}
