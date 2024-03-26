package pojos;

public class EmploymentContract {

    public double grossHourlyRate;
    public double hoursPerWeek;

    public static int weeksPerYear = 52;
    public static double taxRate = 0.3;

    public double annualNetSalary(){
      return  grossHourlyRate * hoursPerWeek * weeksPerYear * (1- taxRate);
    }

}
