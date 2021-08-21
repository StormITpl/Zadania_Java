public class Choinka {
    public static void main(String[] args) {
        int rows =10;
        int space = rows -2;
        int multiply = 1;
        for (int i = 1; i <= rows; i++) {

            for (int j = space+1; j > 0; j--) {
                System.out.print(" ");
            }
            space--;
            for (int k = multiply; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
            multiply += 2;
        }


        for (int i = 0; i < 3; i++){
            for(int j = 0; j <= rows -3; j++){
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}
