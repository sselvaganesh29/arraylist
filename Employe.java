public class Employe
{
    private String name;
    private int id;
    private String department;

    Employe(String name,int id,String department)
    {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName()
    {
        return name;
    }

     public int getId()
    {
        return id;
    }

     public String getDepartment()
    {
        return department;
    }

}