public class Person {

    String firstName; //instance variable
    String lastName;
    int age;
    String job;
    String residence;
    boolean single;

    public Person(String firstName, String lastName, int age){ //constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String job, String residence, boolean single){
        this(firstName, lastName, age); //overloading
        this.job = job;
        this.residence = residence;
        this.single = single;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if( age<=19 && age>=13 ) {
            return true;
        } else {
            return false;
        }
    }

    public String getJob(){
        return job;
    }

    public String getResidence(){
        return residence;
    }
    public boolean isSingle(){
        if(!single){
            return false;
        } else {
            return true;
        }
    }
}
