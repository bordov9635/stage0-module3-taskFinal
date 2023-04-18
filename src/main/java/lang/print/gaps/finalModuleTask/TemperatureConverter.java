package lang.print.gaps.finalModuleTask;

import java.beans.PropertyEditorSupport;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double result = (temperatureCelsius * 9.0 / 5.0) + 32;
        System.out.println(result);
    }
}
