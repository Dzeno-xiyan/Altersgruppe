Schleifen
/Grundlagen der Programmierung /Schleifen
Die algorithmische Struktur der Schleife ermöglicht es in einem Programm einzelne Befehle oder ganze Befehlsketten zu wiederholen. Java bietet (wie jede höhere Programmiersprache) drei verschiedene Schleifenarten an: die anfangsgeprüfte Schleife, die endgeprüfte Schleife und die Zählschleife. Jede dieser Schleifen benötigt drei wichtige Parameter: einen Startwert, einen Endwert und eine Schrittweite.

Um diese Parameter zu verwalten wird eine Zählvariable verwendet, meist i oder j. Die Zählvariable in der Zählschleife muss für diese extra initialisiert werden. Diese gilt dann nur innerhalb dieser Zählschleife. Eine solche Variable, die nur innerhalb eines bestimmten Anweisungsblockes gilt heißt lokale Variable. Im Gegensatz dazu nennt man Variable, die im gesamten Programm gelten, globale Variable.

Überblick
Anfangsgeprüfte Schleife	Endgeprüfte Schleife	Zählschleife
Pseudocode		
i = start
solange i <= end
   Anweisungen
   i = i + step
i = start
wiederhole
   Anweisungen
   i = i + step
solange i <= end
für i von start bis end mit step
   Anweisungen

Java-Quellcode		
i = start;
while (i<=end) {
  Anweisungen;
  i = i + step;
}
i = start;
do {
  Anweisungen;
  i = i + step;
} while (i <= end);
for (int i=start;i<=end;i=i+step) {
  Anweisungen;
}

Struktogramm		
		Dieses Bild hat ein leeres Alt-Attribut. Der Dateiname ist schleifefor.png
Beispiel (Ausgabe der Quadratzahlen bis 25)		
i = 1;
while (i <= 25) {
  System.out.println(i*i);
  i++;
}
i = 1;
do {
  System.out.println(i*i);
  i++;
} while (i <= 25);
for (int i=1; i<=25; i++) {
  System.out.println(i*i);
}
