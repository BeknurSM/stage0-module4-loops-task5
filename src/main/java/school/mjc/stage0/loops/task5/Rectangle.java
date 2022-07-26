package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        int i=1;
        do{
            int j=1;
            if (length == 0 || height == 0){
                System.out.print("");
            }
            else {
                do {
                    if (i == 1 || i == height || j == 1 || j == length) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                    j++;

                } while (j <= length);
                System.out.print("\n");
                i++;
            }
        }while( i<=height);
    }
}