package OOP.ClassObject.equals_and_hashcode;

public class Example {
    public static void main(String[] args) {
        Child child1 = new Child("сынок 1", 1999);
        Child child2 = new Child("сынок 1", 1945);
        Child child3 = new Child("дочка 1", 1900);
        Child child4 = new Child("сынок 3", 1911);

        Child[] children = {child1,child2,child3,child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;
        Child childForfind = new Child("сынок 1", 1945);


        for (Child child : childrenGarden.getChildren()){
//            if (child.getName().equals("сынок 1") & child.getYear() == 1999){
            if (child.equals(childForfind)){
                result = true;
                break;
            }
        }
        System.out.println(result);

    }
}
