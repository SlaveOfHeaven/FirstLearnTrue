package OOP.ClassObject.hashcode;

import OOP.ClassObject.equals_and_hashcode.Child;

public class hashcodeExample {
    public static void main(String[] args) {
        Child child1 = new Child("сынок 1", 1992);
        Child child2 = new Child("сынок 1", 1945);
        Child child3 = new Child("дочка 1", 1900);
        Child child4 = new Child("сынок 3", 1911);

        Child[] group0 = {child3,child1};
        Child[] group1 = {child4,child2};
        Child[][] children = {group0,group1};
        ChildrenGarden_withGroups childrenGarden_withGroups = new ChildrenGarden_withGroups(children);

        Child childForfind = new Child("сынок 1", 1992);

        boolean result = false;

//        for (Child[] group : childrenGarden_withGroups.getChildren()) { //пройдется по всем детям
//            for (Child child : group){
//                if (child.equals(childForfind)){
//                    result = true;
//                    break;
//                }
//            }
//        }


        for (Child child : childrenGarden_withGroups.getChildren()[childForfind.hashCode()]) { //пройдется по нужной группе
            if (child.equals(childForfind)){
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
