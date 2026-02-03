class Demo{
    int price;
    String model;

    @Override
    public String toString() {
        return "Demo [price=" + price + ", model=" + model + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Demo other = (Demo) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

    
    
}

public class ObjectClassEquals {
    public static void main(String[] args) {
        Demo obj1= new Demo();
        obj1.model="Lenovo Yoga";
        obj1.price=78900;

        Demo obj2= new Demo();
        obj2.model="Lenovo Yoga";
        obj2.price=78900;

       boolean r= obj1.equals(obj2);
       System.out.println(r);

       System.out.println(obj1.toString());
    }
}
