public class BmiService {
    public int calculate(int weight, double height) {
        int index = (int) ((int) weight / (height * height));
        return index;

    }
}