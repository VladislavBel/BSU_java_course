import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class KEK {

    public static void main(String[] args) throws Exception {
        //Scanner scanner = new Scanner(System.in);
        /*Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);
        System.out.println(vector1.getLength());
        System.out.println(vector2.getLength());
        System.out.println(vector1.getCos(vector2));
        System.out.println(vector1.getScalar(vector2));
        System.out.println(vector1.CompareByLength(vector2));
        System.out.println(vector1.CompareByAngle(vector2));
        Vector3D vec = vector1.MultiplyVec(vector2);
        vec.vecToCoords();
        workWithDeps(Days.MONDAY);*/

        List<Vector3D> V10 = lab1.genVec(10);
        double med = lab1.median(V10);
        List<Vector3D> VSmol = lab1.GetRidOfSmol(V10, med);
        int Same = lab1.NumOfSame(V10, VSmol);
        //System.out.println(med);
        //System.out.println(Same);

        Random a = new Random(0);

        List<Vector3D> vecList = lab2.GenVecList(10, a::nextInt);

        Comparator<Vector3D> comp = (x,y) -> -Double.compare(x.getLength(), y.getLength());

        List<Vector3D> sortedList = lab2.SortVecList(vecList, comp);

        List<Long> listLen = lab2.mapVecList(vecList, len -> (long) len.getLength());

        long summary = listLen.stream().filter(odd -> odd % 2 == 0).peek(System.out::println).reduce(0L, (c, b) -> c + b);

        System.out.println(summary);

    }
    public static void workWithDeps(Days dep)
    {
            System.out.printf("%s\n", dep.numOfLessons(),"\n");
    }


       // System.out.println("Enter int");
        //int j = scanner.nextInt();
        /*for (;;){
            try{
                divide(100, j, 100);
            } catch (ArithmeticException ex){
                System.out.println("Enter non zero int");
                j = scanner.nextInt();
                divide(100, j, 100);
            }
        }*/
    }
    /*private static double divide(int i, int j, int k){
        int d = i*k/j;
       // System.out.println(d);
        return 0;
    }*/


