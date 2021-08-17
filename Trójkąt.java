// Wypisz w konsoli:
//*
//**
//***
//****
//*****
//Wierszy w takim formacie chcemy uzyskać tyle, ile wynosi wartość przypisana zmiennej x.
public class Trójkąt {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
