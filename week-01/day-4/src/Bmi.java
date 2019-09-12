import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Bmi
{
    public static void main(String[] args)
    {
        double massInKg = 92;
        double heightInM = 1.78;
        System.out.println("BMI: "+massInKg/(heightInM*heightInM));
    }
}
