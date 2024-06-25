public class Main 
{
    public static void main(String[] args)
    {
        Empmanager manager = new Empmanager();

        Employe emp1 = new Employe(1, "selva", "developer");
        Employe emp2 = new Employe(2, "ajay", "IT");

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);


        manager.updateEmployee(1, "razik", "Finance");
       
        manager.removeEmployee(2);
        
    }
}
