package WrapperClass;


// Wrapper class is used to convert primitive into object and vice-versa
// Eight classes of "java.lang" package are known as Wrapper class

// Autoboxing menas Primitive to object 
// Unboxing means object to primitive

// Primitive{boolean , char, byte, short, int, long, float, double}
// Wrapper(object){Boolean, Character, Byte, Short, Integer, Long, Float, Double}


public class New1 {
    public static void main(String[] args) {
        int i =100;
        Integer obj = Integer.valueOf(i);
        System.out.println(obj);
        Integer ob1 = i;
        System.out.println(ob1);

    }
    
}



