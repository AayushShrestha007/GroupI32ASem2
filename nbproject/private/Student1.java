public class Student1 {
    
}
class Animal {
    Animal(){
        System.out.println("Animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is created");
    }
}
class SuperTest3{
    public static void main (String[] args){
        Dog d=new Dog();
    }
}

public class Student1 {
    String ID;
    String Fname;
    Address add;
    public Student1(String id,String fullname,Address add){
        this.ID=id;
        this.Fname=fullname;
        this.add=add;

    }


    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFname() {
        return this.Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public Address getAdd() {
        return this.add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
}

