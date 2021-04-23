package Tugas2;
import Tugas1.Televisi;

public class TelevisiModern extends Televisi {
    static final String TELETEXT = "Teletext";
    static final String TV = "Televisi";
    
    private String modustampilan;
    private String PlayCD;
    private String disctray;
    
    TelevisiModern(String deskripsi, int maxchannel) {
        super(deskripsi, maxchannel);
    }
    
    public void setModusTampilan(String modustampilan) {
        System.out.println("Modus Tampilan : " + modustampilan);
        this.modustampilan = modustampilan;
    }
    
    public void setHalamanTeletext(int HalTeletext) {
        System.out.println("Berpindah ke halaman teletext " + HalTeletext);
    }
    
    public void playCD() {
        if (disctray == null) {
            System.out.println("Tidak ada CD dalam disc tray!");
        } else {
            System.out.println("Memutar FIlm " + disctray);
        }
    }
    
    public void setDiscTray(String disctray) {
        this.disctray = disctray;
    }
}
