import com.example.calculator.Calculator;
import com.example.model.Rate;
import com.example.monitor.ConsoleMonitor;
import com.example.parser.Parser;

import java.io.IOException;


public class Converter {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Myagkov/projects/Converter/src/test.txt";
        Parser parser = new Parser(path);
        ConsoleMonitor monitor = new ConsoleMonitor();
        String currency = monitor.askString();
        double value = monitor.askDouble();
        Rate currentRate = parser.getRate(currency);
        Calculator calculator = new Calculator();
        double result = calculator.calculate(value, currentRate.getValue());
        monitor.print("Итого: " + result);
    }
}
