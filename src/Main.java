public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98; // вес в килограммах
        double height = 1.87; // рост в метрах
        int index;
        index = service.calculate(weight, height);
        {

            System.out.println("Индекс массы тела равен: " + index + ".");
        }
    }
}