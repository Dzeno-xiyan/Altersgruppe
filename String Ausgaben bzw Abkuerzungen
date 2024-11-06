Wie kann eine Ausgabe (String) formatiert werden?
/Grundlagen der Programmierung / Hilfen zu Java / Wie kann eine Ausgabe (String) formatiert werden?
Sowohl in Konsolenprogrammen als auch in GUI-Programme (z. B. in einem jTextArea) kann es notwendig sein, dass eine Ausgabestring formatiert ausgegeben wird.

Die Klasse String stellt mit der statischen Funktion format() eine Möglichkeit bereit, Zeichenketten nach einer Vorgabe zu formatieren.

1
String s = String.format( "Hallo %s. Es gab einen Anruf von %s.", "Ulli", "Tina" );
Der erste übergebene String nennt sich Format-String. Er enthält neben auszugebenden Zeichen weitere so genannte Format-Spezifizierer, die dem Formatierer darüber Auskunft geben, wie er das Argument formatieren soll. %s steht für eine unformatierte Ausgabe eines Strings.

Folgende Format-Spezifizierer sind definiert:

%n	neue Zeile
%%	Prozentzeichen
%h	Hexadezimalzahl
%f	Fließkommazahl (double, float, …)
%b	boolean
%s	String
%d	Dezimalzahl
%t	Datum / Zeit
%e	wissenschaftliche Notation
Ein (wie oben) formatierter String kann nun jedem beliebigen Objekt übergeben werden, z. B. einem TextArea (geeignet für GUI-Programme):

1
2
String s = String.format("|%10.2f|", 12345.678);
jTextArea.append(s);
Für Konsolenprogramme gibt es eine einfache Möglichkeit der Ausgabe mit printf:

1
System.out.printf("|%10.2f|", 12345.678);
Beispiele
01
02
03
04
05
06
07
08
09
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
int i = 123; 
System.out.printf( "|%d|   |%d|%n" ,     i, -i );       // |123|   |-123| 
System.out.printf( "|%5d| |%5d|%n" ,     i, -i );       // |  123| | –123| 
System.out.printf( "|%-5d| |%-5d|%n" ,   i, -i );       // |123  | |-123 | 
System.out.printf( "|%+-5d| |%+-5d|%n" , i, -i );       // |+123 | |-123 | 
System.out.printf( "|%05d| |%05d|%n%n",  i, -i );       // |00123| |-0123| 
System.out.printf( "|%X|  |%x|%n", 0xabc, 0xabc );      // |ABC|  |abc| 
System.out.printf( "|%04x| |%#x|%n%n", 0xabc, 0xabc );  // |0abc| |0xabc| 
 
double d = 12345.678; 
System.out.printf( "|%f| |%f|%n" ,         d, -d );     // |12345,678000| |-12345,678000| 
System.out.printf( "|%.2f| |%.2f|%n" ,     d, -d );     // |12345,68| |-12345,68| 
System.out.printf( "|%,10f| |%,10f|%n" ,   d, -d );     // |12.345,678000| |-12.345,678000| 
System.out.printf( "|%10.2f| |%10.2f|%n" , d, -d );     // |  12345,68| | –12345,68| 
System.out.printf( "|%010.2f| |%010.2f|%n",d, -d );     // |0012345,68| |-012345,68| 
 
String s = "Monsterbacke"; 
System.out.printf( "%n|%s|%n", s );                     // |Monsterbacke| 
System.out.printf( "|%20s|%n", s );                     // |        Monsterbacke| 
System.out.printf( "|%-20s|%n", s );                    // |Monsterbacke        | 
System.out.printf( "|%7s|%n", s );                      // |Monsterbacke| 
System.out.printf( "|%.7s|%n", s );                     // |Monster| 
System.out.printf( "|%20.7s|%n", s );                   // |             Monster| 
 
Date t = new Date(); 
System.out.printf( "%tT%n", t );                        // 11:01:39 
System.out.printf( "%tD%n", t );                        // 04/18/08 
System.out.printf( "%1$te. %1$tb%n", t );               // 18. Apr
