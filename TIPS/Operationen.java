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
