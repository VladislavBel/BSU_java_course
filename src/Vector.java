public abstract class Vector {

    public abstract double getLength();

    public abstract float getScalar(Vector vector) throws Exception;

    public abstract double getCos(Vector vector) throws Exception;

}

class Vector3D extends Vector implements VectorCompareable, VectorMultiplyable, Comparable<Vector3D> {
    private float x;
    private float y;
    private float z;

    Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    private static Vector3D is3D(Vector vector) throws Exception {
        if (vector instanceof Vector3D) {
            return (Vector3D) vector;
        } else {
            throw new Exception("IS NOT 3D VECTOR");
        }
    }


    @Override
    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public float getScalar(Vector vector) throws Exception {
        Vector3D vec = is3D(vector);
        return this.x * vec.x + this.y * vec.y + this.z * vec.z;
    }

    @Override
    public double getCos(Vector vector) throws Exception {
        Vector3D vec = is3D(vector);
        return getScalar(vec) / (vec.getLength() * getLength());
    }

    @Override
    public int CompareByLength(Vector vector) throws Exception {
        Vector vec = is3D(vector);
        double len1 = this.getLength();
        double len2 = vec.getLength();
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int CompareByAngle(Vector vector) throws Exception {
        Vector3D vec = is3D(vector);
        Vector vec0 = new Vector3D(1, 1, 1);
        double ang1 = this.getCos(vec0);
        double ang2 = vec.getCos(vec0);
        if (ang1 > ang2) {
            return 1;
        } else if (ang1 < ang2) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Vector3D MultiplyVec(Vector vector) throws Exception {
        Vector3D vec = is3D(vector);
        Vector3D vec1 = new Vector3D(this.y * vec.z - this.z * vec.y, this.z * vec.x - this.x * vec.z, this.x * vec.y - this.y * vec.x);
        return vec1;
    }

    public void vecToCoords() {
        System.out.printf("%s %s %s \n", String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z));
        return;
    }

    @Override
    public int compareTo(Vector3D o) {
        double len1 = this.getLength();
        double len2 = o.getLength();
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else {
            return 0;
        }
    }
}



