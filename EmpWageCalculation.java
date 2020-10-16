public class EmpWageCalculation {
    public static final int partTimeEmp=1;
    public static final int fullTimeEmp=2;
    public static final int numberOFWroking_days=5;
    public static final int max_hrs_perMonth=5;
    public static void main(String args[]) {
        int wagePerHr = 20;
        int empHrs = 0;
        int empWage = 0;
        int totalWage=0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;
        while(totalEmpHrs<=max_hrs_perMonth && totalWorkingDays<numberOFWroking_days)
        for (int day = 0; day < numberOFWroking_days; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case partTimeEmp:
                    empHrs = 4;
                    break;
                case fullTimeEmp:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs=totalEmpHrs+empHrs;
        }
        totalWage = wagePerHr * totalEmpHrs;
        System.out.println("total wage:"+totalWage );
    }
}
