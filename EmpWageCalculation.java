public class EmpWageCalculation {
    public static void main(String args[]){
        int isEmpPresent=1;
        double empCheck=Math.floor(Math.random()*10)%2;
        if(empCheck==isEmpPresent){
            System.out.println("employee is present");
        }
        else{
            System.out.println("employee is absent");
        }
    }
}
