package Scanner;

public class WetterStat3dim {
    public static void main(String[] args) {
        // 1. Temperaturen und Windstärken in einem 3D-Array speichern
        int[][][] wetterDaten = {
                {{0, 12, 2}, {1, 14, 6}, {2, 10, 3}}, 
                {{3, 7, 4}, {4, 11, 4}, {5, 13, 3}}, 
                {{6, 12, 3}, {7, 15, 3}, {8, 15 , 4}},
                {{9, 18, 5}, {10, 16, 3}, {11, 13, 3}}, 
                {{12, 10, 4}, {13, 12, 5}}
        };

        // 2. Tabelle ausgeben
        System.out.println("Tag\tTemperatur\tWindstärke");
        for (int[][] woche : wetterDaten) {
            for (int[] tag : woche) {
                System.out.println(tag[0] + "\t" + tag[1] + "         \t" + tag[2]);
            }
        }
             
               // 3. Größten Temperatur- und Windstärkenunterschied finden
                int maxTempDifferenz = 0, maxWindDifferenz = 0;
                int tag1Temp = 0, tag2Temp = 1, tag1Wind = 0, tag2Wind = 1;
                for (int[][] woche : wetterDaten) {
                    for (int i = 1; i < woche.length; i++) {
                        int tempDifferenz = Math.abs(woche[i][1] - woche[i - 1][1]);
                        int windDifferenz = Math.abs(woche[i][1] - woche[i - 1][1]);

                        if (tempDifferenz > maxTempDifferenz) {
                            maxTempDifferenz = tempDifferenz;
                            tag1Temp = woche[i - 1][0];
                            tag2Temp = woche[i][0];
                        }

                        if (windDifferenz > maxWindDifferenz) {
                            maxWindDifferenz = windDifferenz;
                            tag1Wind = woche[i - 1][0];
                            tag2Wind = woche[i][0];
                        }
                    }
                }

                System.out.println("Der größte Temperaturunterschied beträgt " + maxTempDifferenz + " Grad zwischen Tag " + tag1Temp + " und Tag " + tag2Temp);
                System.out.println("Der größte Windstärkenunterschied beträgt " + maxWindDifferenz + " zwischen Tag " + tag1Wind + " und Tag " + tag2Wind);
            }
        }
