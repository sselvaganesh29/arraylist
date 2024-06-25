import java.util.ArrayList;

public Empmanager
{
    private ArrayList<Employe> emplist;

   
   public Empmanager() 
    {
        this.emplist = new ArrayList<>();
    }

    public void addemp(Employe emp)
    {
        emplist.add(emp)
    }

     public void removeemp(int id) 
    {
        for (Employe emp : emplist)
        {
            if (employee.getId() == id) 
            {
                employees.remove(emp);
                break;
            }
        }
    }

     public void updateemp(int id, String name, String department) 
    {
        for (Employe emp : emplist)
        {
            if (emp.getId() == id) 
            {
                emplist.set(emplist.indexOf(employee), new Employe(id, name, department));
                break;
            }
        }
    }


}