import java.util.*;
import java.util.function.IntSupplier;



class IntSupplierTest {
    public static void main(String[] args) {
        IntSupplier intSupplier1 = () -> Integer. MAX_VALUE ;  // lamba expression
        System.out.println("The maximum value of an Integer is: " + intSupplier1. getAsInt() );

        IntSupplier intSupplier2 = () -> Integer. MIN_VALUE ;
        System.out.println("The minimum value of an Integer is: " + intSupplier2. getAsInt() );

        int a = 10, b = 20;
        IntSupplier intSupplier3 = () -> a*b;
        System.out.println("The multiplication of a and b is: " + intSupplier3. getAsInt() );
    }
}
public class lab2 {

    Random a = new Random(0);

    public static List<Vector3D> GenVecList(int n){
        List<Vector3D> VectorList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            Vector3D V = new Vector3D(a.nextInt(100), a.nextInt(100), a.nextInt(100));
            VectorList.add(V);
        }
        return v1;

    }
}
