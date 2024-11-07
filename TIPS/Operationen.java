1. Arithmetische Operatoren
Diese Operatoren dienen für mathematische Berechnungen:

Addition: +
Subtraktion: -
Multiplikation: *
Division: /
Modulo (Rest bei Division): %
Inkrement: ++
Dekrement: --
Beispiel:

Java
int a = 10, b = 5;
int summe = a + b; // summe wird 15
int rest = a % b; // rest wird 0

-------------------------------------------------------------

  2. Zuweisungsoperatoren
Mit diesen Operatoren wird ein Wert einer Variablen zugewiesen:

Einfache Zuweisung: =
Zusammengesetzte Zuweisung: +=, -=, *=, /=, %=
Beispiel:

Java
int x = 10;
x += 5; // x wird 15 == x = x + 5

------------------------------------------------------------


 3. Vergleichsoperatoren
Diese Operatoren vergleichen Werte und liefern einen booleschen Wert (true oder false) zurück:

Gleichheit: ==
Ungleichheit: !=
Größer als: >
Kleiner als: <
Größer oder gleich: >=
Kleiner oder gleich: <=
Beispiel:

Java
int a = 10, b = 5;
boolean istGleich = (a == b); // istGleich wird false

----------------------------------------------------------------------------


4. Logische Operatoren
Diese Operatoren werden für logische Ausdrücke verwendet:

UND: &&
ODER: ||
NICHT: !
Beispiel:

Java
boolean istSonnig = true;
boolean istWarm = true;
boolean kannManSchwimmen = istSonnig && istWarm; // kannManSchwimmen wird true


----------------------------------------------------------------------------------



  5. Bitweise Operatoren
Diese Operatoren arbeiten auf der Bit-Ebene:

AND: &
OR: |
XOR: ^
NOT: ~
Linkshift: <<
Rechtshift: >>
Beispiel:

Java
int a = 5, b = 3;
int result = a & b; // result wird 1 (bitweise AND)



----------------------------------------------------------------------------------------



  6. Ternärer Operator
Der ternäre Operator ist eine verkürzte Form der if-else-Anweisung:

Java
bedingung ? wert_wenn_wahr : wert_wenn_falsch // If else

Java
int zahl = 10;
String ergebnis = (zahl % 2 == 0) ? "gerade" : "ungerade";

  ------------------------------------------------------------------------------------------------------------

7.Weitere Operatoren:

Inkrement/Dekrement: ++, --
String-Konkatenation: +
Instanz-von: instanceof


  -----------------------------------------------------------------------------------------------------------------

Gegeben: a = 4, b = 1

Ausdruck 1: (a < 5) || (a > 6)
(4 < 5) ist wahr (true)
(4 > 6) ist falsch (false)
ODER (||) bedeutet, dass mindestens einer der Ausdrücke wahr sein muss, damit der gesamte Ausdruck wahr ist.
Ergebnis: wahr (true)
Ausdruck 2: (a == 3) ^ (2 == b)
(4 == 3) ist falsch (false)
(2 == 1) ist falsch (false)
XOR (^) bedeutet, dass genau einer der Ausdrücke wahr sein muss, damit der gesamte Ausdruck wahr ist.
Ergebnis: falsch (false)
Ausdruck 3: (b >1) && (a > 3)
(1 > 1) ist falsch (false)
(4 > 3) ist wahr (true)
UND (&&) bedeutet, dass beide Ausdrücke wahr sein müssen, damit der gesamte Ausdruck wahr ist.
Ergebnis: falsch (false)
Ausdruck 4: (a + b < 19) && (b < 1)
(4 + 1 < 19) ist wahr (true)
(1 < 1) ist falsch (false)
UND (&&) bedeutet, dass beide Ausdrücke wahr sein müssen, damit der gesamte Ausdruck wahr ist.
Ergebnis: falsch (false)
Ausdruck 5: (3 < 5) && (3 > 5)
(3 < 5) ist wahr (true)
(3 > 5) ist falsch (false)
UND (&&) bedeutet, dass beide Ausdrücke wahr sein müssen, damit der gesamte Ausdruck wahr ist.
Ergebnis: falsch (false)
Ausdruck 6: ((3 < 5) && (a > 3)) ^ (b == 1)
(3 < 5) ist wahr (true)
(4 > 3) ist wahr (true)
(1 == 1) ist wahr (true)
Innerer Ausdruck: (true && true) ist wahr
Gesamtausdruck: wahr ^ wahr ist falsch (false)
Ergebnis: falsch (false)
Zusammenfassung der Ergebnisse:

Ausdruck	Wert
(a < 5)	(a > 6)
(a == 3) ^ (2 == b)	falsch
(b >1) && (a > 3)	falsch
(a + b < 19) && (b < 1)	falsch
(3 < 5) && (3 > 5)	falsch
((3 < 5) && (a > 3)) ^ (b == 1)	falsch

In Google Sheets exportieren
Wichtige logische Operatoren:

&& (UND): Beide Ausdrücke müssen wahr sein.
|| (ODER): Mindestens ein Ausdruck muss wahr sein.
^ (XOR): Genau einer der Ausdrücke muss wahr sein.
Hinweis: Die Klammern in Ausdruck 6 sind wichtig, um die Auswertungskette zu bestimmen.

  
