package Week2;

public class SetterAndGetter {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String []args)
    {
        SetterAndGetter  sg=new SetterAndGetter();
        sg.setAge(20);
        System.out.println(sg.getAge());
        sg.setName("Priyanka");
        System.out.println(sg.getName());
    }

}
