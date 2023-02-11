package circus.animals;

import circus.Asset;

public abstract class Animal implements Asset {

//    public String speak() {
//        return null;
//    }
    public abstract String speak();
    public int getValue(){
        return 10;
    }

}
