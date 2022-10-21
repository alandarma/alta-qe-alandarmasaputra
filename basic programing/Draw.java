public class Draw {

    public static void main(String [] args) {
        int Data = 5;

        Draw(3);
        /*
        Y Z X
        Z Y X
        Y Z X
         */

        Draw(5);
        /*
        Y Z X Z Y
        X Y Z X Z
        Y X Y Z X
        Z Y X Y Z
        X Z Y X Y
         */

        Draw (1);
        // Y

        System.out.println("YZXZY" +
                "XYZXZ" +
                "YXYZX" +
                "ZYXYZ" +
                "XYZXY");


    }

    private static void Draw(int i) {
    }
}
