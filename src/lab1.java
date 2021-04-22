import java.util.*;

public class lab1 {
    public static List<Vector3D> genVec(int n) {
        Random a = new Random(0);
        List<Vector3D> v1 = new ArrayList<>();
        for (int i = 0; i < n; i++){
                Vector3D V = new Vector3D(a.nextInt(100), a.nextInt(100), a.nextInt(100));
                v1.add(V);
        }
        return v1;
    }

    public static double median (List<Vector3D> vecs){
        Collections.sort(vecs);
        int len = vecs.size();
        if (len % 2 == 1){
            return vecs.get(len/2).getLength();
        }
        else {
            return (vecs.get(len/2).getLength() + vecs.get(len/2 - 1).getLength())/2;
        }

    }

    public  static List<Vector3D> GetRidOfSmol(List<Vector3D> vecs, double len){
        int n = vecs.size();
        List<Vector3D> v2 = new ArrayList<>();
        for (int i = 0; i < vecs.size(); i++){
            if (vecs.get(i).getLength() < len) {
                v2.add(vecs.get(i));
            }
        }
        for (int i = 0; i < v2.size(); i++){
            vecs.remove(v2.get(i));
        }
        return v2;
    }

    public  static int NumOfSame(List<Vector3D> vecs1, List<Vector3D> vecs2){
        int num = 0;
        int n = vecs1.size();
        for (int i = 0; i < n; i++){
            if (vecs2.contains(vecs1.get(i))){
                num++;
            }
        }
        return num;
    }

}
