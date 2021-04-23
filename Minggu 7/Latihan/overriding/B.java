package overriding;

public class B extends A{
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); // Memanggil method milik dari supeclassnya.
        System.out.println("Method milik class B dipanggil");
    }
}
