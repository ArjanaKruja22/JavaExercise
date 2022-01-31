public class App{
    public static void main(String [] args) throws Exception {
        System.out.println("Hello,world!");
        Person p1 = new Person("Arjana","Kruja","F");
        Person p2 = new Person("Arjana","Kruja","F"); //different because they have different spaces
        //p2.setName("Mario");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println("The length of Name of object is" + p1.getName().length());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        if(p1 == p2){
            System.out.println("objects are equal");
        }
        else {
        System.out.println("objects are different");
        }
        if(p1.equals(p2)){
            System.out.println("content of objects are equal");
        }
        else 
        System.out.println("content of objects are different");
        }

        public String toString(){
            return "The person have the following data : Name " + this.name + 
            "The surname is" + this.surname + "the gender is" + this.gender ; 
        }
    }

    

