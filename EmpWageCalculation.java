public class EmpWageCalculation {
    public static void main(String args[]){
        int wagePerHr=20;
        int partTimeEmp=1;
        int fullTimeEmp=2;
        int empHrs=0;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%3;
        if(empCheck==partTimeEmp){
           empHrs=4;
        }
        else if (empCheck==fullTimeEmp){
            empHrs=8;
        }
        else{
            empHrs=0;
        }

        empWage=wagePerHr*empHrs;
        System.out.println("employee wage :"+empWage);
    }
}
