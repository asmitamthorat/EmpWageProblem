public class EmpWageCalculation {
    public static final int partTimeEmp=1;
    public static final int fullTimeEmp=2;
    public static void main(String args[]){
        int wagePerHr=20;
        int empHrs=0;
        int empWage=0;
        int empCheck=(int)Math.floor(Math.random()*10)%3;
        switch (empCheck){
            case partTimeEmp:
                empHrs=4;
                break;
            case fullTimeEmp:
                empHrs=8;
                break;
            default:
                empHrs=0;
        }
        empWage=wagePerHr*empHrs;
        System.out.println("employee wage :"+empWage);
    }
}
