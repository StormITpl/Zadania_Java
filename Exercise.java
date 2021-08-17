// Stwórz metodę, która sprawdzi,
// czy jeden łańcuch znaków zawiera wszystkie znaki z drugiego łańcucha
// (jeden znak w pierwszym nie może reprezentować więcej niż jednego w drugim).
public class Exercise {
    public static void main(String[] args) {

        System.out.println(firstEqualsSecond("abaad","dabaad"));

    }

    public static boolean firstEqualsSecond (String firstString, String secondString){
        boolean equalsString = false;               //potwierdzenie czy założenie zadania jest prawdziwe
        boolean controlBoolean = true;              //boolean potrzeby by konkretny warunek nie powtórzył się więcej niż dwa razy
        int count = 0 ;                             //ile znaków zostało zamienionych
        String tempString ="";                      //tymczasowy String do przechowywania pojedynczego znaku w formie Stringa


        for(int i = 0; i < firstString.length(); i ++){                                 //zaczynam od pierwszego znaku piewszego Stringa
            for (int j = 0; j < secondString.length(); j++ ){                           //tutaj przechodzi po wszystkich znakach drugiego Stringa
                if(firstString.charAt(i)==secondString.charAt(j) && controlBoolean){    //jeśli któreś znaki się pokryją to zachodzi proces zamiany
                    count++;                                                            //zwiększenie licznika
                    controlBoolean=false;                                               // bez tego działało jak metoda .replaceAll(), a tak to zamieniam tylko jeden znak
                    tempString += secondString.charAt(j);                               //wrzucenie pasującego znaku do tymczasowego Stringa
                    secondString=secondString.replaceFirst(tempString," ");  //usuniecie pasującego znaku
                    if(count==secondString.length() && count==firstString.length()){    //jeśli licznik jest równy obu Stringom to oznacza że wszystie znaki pasowały
                        equalsString=true;                                              //true jeśli założenie zadania jest prawdziwe
                    }
                }
            }
            controlBoolean=true;                                                        //ustawienie ponownie na false by można było sprawdzić drugą taką samą litere która już została usunięta
        }

        return equalsString;
    }

}


