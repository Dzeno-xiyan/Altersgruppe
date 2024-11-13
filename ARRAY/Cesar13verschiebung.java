/* Aufgabe 4 ~ Caesar’s Buchstabenschubsen
Schwierigkeit:    
Sie haben eine Kiste aus dem alten Rom gefunden. Darin befinden sich ein alter Brief eines
römischen Feldherrns. Dummerweise ist die Nachrichten verschlüsselt aufgeschrieben. Da der
Kiste keine Chiffrierscheibe beilag, brauchen Sie ein Programm um den Text zu entschlüsseln. Von
einem Professor der Archäologie aus Amerika wissen Sie das Vorgehen der Verschlüsselung. Jeder
Buchstabe des Alphabets wird durch einen Buchstaben ersetzt, welcher 13 Stellen davor oder
dahinter liegt. In der folgenden Tabelle ist aufgezeigt, welcher Buchstabe mit welchem anderen
Buchstaben verstauscht wird.
A B C D E F G H I J K L M
N O P Q R S T U V W X Y Z
13
Als Grundgerüst kann folgender Code dienen:
public static String encrypt(String text) {
}
In dem Brief steht folgende Nachricht:
Jrvg uvagra, uvagre qra Jbegoretra, srea qre Yäaqre Ibxnyvra haq Xbafbanagvra yrora
qvr Oyvaqgrkgr. Notrfpuvrqra jbuara fvr va Ohpufgnounhfra na qre Xüfgr qrf Frznagvx,
rvarf tebßra Fcenpubmrnaf. Rva xyrvarf Oäpuyrva anzraf Qhqra syvrßg qhepu vuera Beg
haq irefbetg fvr zvg qra aögvtra Ertryvnyvra. Rf vfg rva cnenqvrfzngvfpurf Ynaq, va
qrz rvarz troengrar Fngmgrvyr va qra Zhaq syvrtra. Avpug rvazny iba qre nyyzäpugvtra
Vagrechaxgvba jreqra qvr Oyvaqgrkgr orureefpug – rva trenqrmh habegubtencuvfpurf
Yrora. Rvarf Gntrf nore orfpuybß rvar xyrvar Mrvyr Oyvaqgrkg, vue Anzr jne Yberz
Vcfhz, uvanhf mh trura va qvr jrvgr Tenzzngvx. Qre tebßr Bkzbk evrg vue qniba no, qn
rf qbeg jvzzryr iba oöfra Xbzzngn, jvyqra Sentrmrvpura haq uvagreuäygvtra Frzvxbyv,
qbpu qnf Oyvaqgrkgpura yvrß fvpu avpug orveera. Rf cnpxgr frvar fvrora Irefnyvra,
fpubo fvpu frva Vavgvny va qra Tüegry haq znpugr fvpu nhs qra Jrt. Nyf rf qvr refgra
Uütry qrf Xhefvitrovetrf rexybzzra unggr, jnes rf rvara yrgmgra Oyvpx mheüpx nhs qvr
Fxlyvar frvare Urvzngfgnqg Ohpufgnounhfra, qvr Urnqyvar iba Nycunorgqbes haq qvr
Fhoyvar frvare rvtrara Fgenßr, qre Mrvyratnffr. Jruzügvt yvrs vuz rvar eurgbevfpur
Sentr üore qvr Jnatr, qnaa frgmgr rf frvara Jrt sbeg. Hagrejrtf gens rf rvar Pbcl. Qvr
Pbcl jneagr qnf Oyvaqgrkgpura, qn, jb fvr urexäzr jäer fvr mvtzny hztrfpuevrora jbeqra
haq nyyrf, jnf iba vuerz Hefcehat abpu üoevt jäer, frv qnf Jbeg "haq" haq qnf
Oyvaqgrkgpura fbyyr hzxruera haq jvrqre va frva rvtrarf, fvpurerf Ynaq mheüpxxruera.
Qbpu nyyrf Thgmherqra xbaagr rf avpug üoremrhtra haq fb qnhregr rf avpug ynatr, ovf
vuz rva cnne urvzgüpxvfpur Jreorgrkgre nhsynhregra, rf zvg Ybatr haq Cnebyr orgehaxra
znpugra haq rf qnaa va vuer Ntraghe fpuyrccgra, jb fvr rf süe vuer Cebwrxgr jvrqre haq
jvrqre zvßoenhpugra. Haq jraa rf avpug hztrfpuevrora jheqr, qnaa orahgmra Fvr rf
vzzreabpu.
 Das Word "Hello" würde verschlüsselt zu "Uryyb" werden.

Character (char) können auch mit <, >, == verglichen werden. 'a' < 'b' ist true, da 'a'
vor 'b' ist.

Wird beispielsweise zu 'a' zwei dazu addiert, so bekommt man den Buchstaben 'c'
als Ergebnis */





package Scanner;

public class Cesaaaaarentschluesseln {

    public static String decryptCaesar(String encryptedText, int shift) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            if (Character.isLetter(c)) 
 {
                // Umwandlung in Kleinbuchstaben für einfachere Berechnung
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // Berechnung des verschobenen Buchstabens
                char decryptedChar = (char) ((c - base - shift + 26) % 26 + base);
                decryptedText.append(decryptedChar);
            } else {
                decryptedText.append(c);
            }
        }
        return decryptedText.toString();
    }


    public static void main(String[]
 args) {
        String encryptedMessage = "Jrvg uvagra, uvagre qra Jbegoretra, srea qre Yäaqre Ibxnyvra haq Xbafbanagvra yrora\r\n"
        		+ "qvr Oyvaqgrkgr. Notrfpuvrqra jbuara fvr va Ohpufgnounhfra na qre Xüfgr qrf Frznagvx,\r\n"
        		+ "rvarf tebßra Fcenpubmrnaf. Rva xyrvarf Oäpuyrva anzraf Qhqra syvrßg qhepu vuera Beg\r\n"
        		+ "haq irefbetg fvr zvg qra aögvtra Ertryvnyvra. Rf vfg rva cnenqvrfzngvfpurf Ynaq, va\r\n"
        		+ "qrz rvarz troengrar Fngmgrvyr va qra Zhaq syvrtra. Avpug rvazny iba qre nyyzäpugvtra\r\n"
        		+ "Vagrechaxgvba jreqra qvr Oyvaqgrkgr orureefpug – rva trenqrmh habegubtencuvfpurf\r\n"
        		+ "Yrora. Rvarf Gntrf nore orfpuybß rvar xyrvar Mrvyr Oyvaqgrkg, vue Anzr jne Yberz\r\n"
        		+ "Vcfhz, uvanhf mh trura va qvr jrvgr Tenzzngvx. Qre tebßr Bkzbk evrg vue qniba no, qn\r\n"
        		+ "rf qbeg jvzzryr iba oöfra Xbzzngn, jvyqra Sentrmrvpura haq uvagreuäygvtra Frzvxbyv,\r\n"
        		+ "qbpu qnf Oyvaqgrkgpura yvrß fvpu avpug orveera. Rf cnpxgr frvar fvrora Irefnyvra,\r\n"
        		+ "fpubo fvpu frva Vavgvny va qra Tüegry haq znpugr fvpu nhs qra Jrt. Nyf rf qvr refgra\r\n"
        		+ "Uütry qrf Xhefvitrovetrf rexybzzra unggr, jnes rf rvara yrgmgra Oyvpx mheüpx nhs qvr\r\n"
        		+ "Fxlyvar frvare Urvzngfgnqg Ohpufgnounhfra, qvr Urnqyvar iba Nycunorgqbes haq qvr\r\n"
        		+ "Fhoyvar frvare rvtrara Fgenßr, qre Mrvyratnffr. Jruzügvt yvrs vuz rvar eurgbevfpur\r\n"
        		+ "Sentr üore qvr Jnatr, qnaa frgmgr rf frvara Jrt sbeg. Hagrejrtf gens rf rvar Pbcl. Qvr\r\n"
        		+ "Pbcl jneagr qnf Oyvaqgrkgpura, qn, jb fvr urexäzr jäer fvr mvtzny hztrfpuevrora jbeqra\r\n"
        		+ "haq nyyrf, jnf iba vuerz Hefcehat abpu üoevt jäer, frv qnf Jbeg \"haq\" haq qnf\r\n"
        		+ "Oyvaqgrkgpura fbyyr hzxruera haq jvrqre va frva rvtrarf, fvpurerf Ynaq mheüpxxruera.\r\n"
        		+ "Qbpu nyyrf Thgmherqra xbaagr rf avpug üoremrhtra haq fb qnhregr rf avpug ynatr, ovf\r\n"
        		+ "vuz rva cnne urvzgüpxvfpur Jreorgrkgre nhsynhregra, rf zvg Ybatr haq Cnebyr orgehaxra\r\n"
        		+ "znpugra haq rf qnaa va vuer Ntraghe fpuyrccgra, jb fvr rf süe vuer Cebwrxgr jvrqre haq\r\n"
        		+ "jvrqre zvßoenhpugra. Haq jraa rf avpug hztrfpuevrora jheqr, qnaa orahgmra Fvr rf\r\n"
        		+ "vzzreabpu"; // Hier den kompletten verschlüsselten Text einfügen"
        int shift = 13; // Verschiebung für die Caesar-Verschlüsselung

        String decryptedMessage = decryptCaesar(encryptedMessage, shift);
        System.out.println(decryptedMessage);
    }
}
