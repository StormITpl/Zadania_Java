// Stwórz metodę contains, która przyjmuje dwa łańcuchy jako parametry,
// a która zwraca informację, czy pierwszy łańcuch zawiera drugi.
public class MetodaContains {
    public static void main(String[] args) {
        stringInString("deeabcdefghi","def");
    }

    public static void stringInString (String secondText, String firstText) {
        int firstStringLength = 0;          // licznik na potrzeby konkretnej pętli
        boolean firstInSecond = false;      // wartość logiczna potwierdzająca czy pierwszy String znajduje się w drugim

        for (int i = 0; i < secondText.length(); i++) {         //petla ma przejechać po wszystkich literach drugiego stringa
            if (secondText.charAt(i) == firstText.charAt(0)) {  //porównuje kolejne znaki drugiego strina z pierwszym znakiem krótszego
                for (int j = 0; j < firstText.length(); j++) {  //jeśli się zgadza robimy pętle max tyle razy ile długość pierwszego stringa
                    if (secondText.charAt(i + j) == firstText.charAt(firstStringLength)) { //sprawdzamy kolejne znaki począwszy od tego od którego się zgadzał pierwszy warunek
                        firstStringLength++;                    //przyrost kluczowego licznika
                        if (firstStringLength == firstText.length()) { //gdy licznik osiągnie długość pierwszego stringa oznacza że znajduje się on w drugim stringu
                            firstInSecond = true;               //wystarczy że raz warunek się spełni żeby było TRUE
                        }
                    } else {
                        firstStringLength = 0;                  // w przypadku przerwania warunku zerujemy licznik
                    }
                }
            }
        }

        if(firstInSecond){
            System.out.println("Pierwszy łańcuch "+ secondText + " zawiera drugi łańcuch "+ firstText);
        } else {
            System.out.println("Pierwszy łańcuch "+ secondText + " nie zawiera drugiego łańcucha "+ firstText);
        }
    }
}
