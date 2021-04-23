package Tugas1;
import java.util.Arrays;

public class Televisi {
    private String deskripsi;
    private int maxchannel;
    
    private String[] channels;
    
    public Televisi(String deskripsi, int maxchannel) {
        this.deskripsi = deskripsi;
        this.maxchannel = maxchannel;
    }
    
    public Televisi() {
        
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void getChannels() {
        if(channels == null) {
            System.out.println("Belum ada channel yang diset!");            
        } else {
            System.out.println(Arrays.toString(channels));
        }       
    }
    
    public void setChannels(String[] channels) {
        if (channels.length > maxchannel) {
            System.out.println("Maaf channel ini hanya dapat menyimpan " + maxchannel + " channel");
        } else {
            System.out.println("Informasi channel berhasil diupdate!");
            this.channels = channels;
        }
    }
    
    public void setChannelAktif(int channelAktif) {
        if (channelAktif >= maxchannel) {
            System.out.println("Channel yang Anda inginkan belum diset");
        } else {
            System.out.println("Pindah channel ke : " + channels[channelAktif]);
        }
    }
    
    public void setVolume(int volume) {
        System.out.println("Intesitas volume saat ini : " + volume);
    }
}
