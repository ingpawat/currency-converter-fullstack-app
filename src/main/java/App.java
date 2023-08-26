public class App {
        public static void main (String[] args){
                double inputCurrency = 3;
                convertCurrency(inputCurrency);
        }
        static void convertCurrency( double inputCurrency){
                double targetToConvertCurrency = 2;
                double result = (inputCurrency * targetToConvertCurrency);
                System.out.println(result);
        }
}
