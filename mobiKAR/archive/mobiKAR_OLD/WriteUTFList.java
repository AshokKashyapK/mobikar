/*
 * WriteLocaleList.java
 *
 * Created on 9 pa�dziernik 2004, 18:18
 */
import java.io.*;
/**
 *
 * @author  MiKO
 */
public class WriteUTFList {
    
    /** Creates a new instance of WriteLocaleList */
    public WriteUTFList() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("/var/song.dir"));
        dos.writeInt(3);
        dos.writeUTF("1");
        dos.writeUTF("W�r�d nocnej ciszy");
        dos.writeInt(83338);
        dos.writeUTF("2");
        dos.writeUTF("Dzisiaj w Betlejem");
        dos.writeInt(116166);
        dos.writeUTF("3");
        dos.writeUTF("Gdy �liczna Panna");
        dos.writeInt(170652);
        dos.close();
        System.out.println("done!");
    }
}
