package tugas1;

    class person {
        String fName;
        String IName;
        int stuId;
        String stuStatus;
        
        public void set (String fName, String IName, int stuId, String stuStatus) {
                this.fName = fName;
                this.IName = IName;
                this.stuId = stuId;  
                this.stuStatus = stuStatus;
            }
            public void show () {
                System.out.println("Student Information");
                System.out.println("Student Name : " + fName + IName);
                System.out.println("Studen ID : " + stuId);
                System.out.println("Student Status : " + stuStatus);
            }
    }
    public class Tugas1 {
        public static void main(String[] args) {
        person javaperson = new person();
                javaperson.set("Lisa ", "Palombo", 123456789, "Active");
                javaperson.show();
    }    
}
