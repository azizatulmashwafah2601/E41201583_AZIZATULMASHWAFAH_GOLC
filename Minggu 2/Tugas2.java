package tugas2;

import person.person;

public class Tugas2 {

    public static void main(String[] args) {
        person p1 = new person("Arial", 37);
        person p2 = new person("Joseph", 15);
        
        if(p1.getAge()==p2.getAge())
        {
            System.out.println(p1.getName()+" is the same age as " + p2.getAge());
        }
        else 
        {
            System.out.println(p1.getName()+" is Not the same age as " + p2.getAge());
        }
    }
    
}
