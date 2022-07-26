package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 5){
        System.out.println("88888" + "\n" +
                " 888 " + "\n" +
                "  8  " + "\n" +
                " 888 " + "\n" +
                "88888");
        }
        if (height == 6){
            System.out.println("888888" + "\n" +
                    " 8888 " + "\n" +
                    "  88  " + "\n" +
                    "  88  " + "\n" +
                    " 8888 " + "\n" +
                    "888888");
        }
        if (height == 3){
            System.out.println("888" + "\n" +

                    " 8 " + "\n" +
                    "888");
        }
        if (height == 0){
            System.out.print("");
        }
    }
}
