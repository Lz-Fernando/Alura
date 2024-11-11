public class ConverterTemperatura {
    public static void main(String[] args) throws Exception {
        int temperatura = 10;

        double converter = (int) (temperatura * 1.8) + 32;

        System.out.println(converter);
    }
}