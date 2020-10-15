public class EmpWageCalculation {
    public static void main(String args[]){
        int wagePerHr=20;
        int isEmpPresent=1;
        int hrForDay=8;
        int empWage;
        double empCheck=Math.floor(Math.random()*10)%2;
        if(empCheck==isEmpPresent){
            empWage=wagePerHr*hrForDay;
            System.out.println("employee wage :"+empWage);
        }
        else{
            System.out.println("employee is absent");
        }
    }
}
