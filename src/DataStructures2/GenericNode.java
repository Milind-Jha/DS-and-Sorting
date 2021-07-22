package DataStructures2;

public class GenericNode<GEN> {

    GEN data;
    GenericNode<GEN> next;

    public GenericNode(GEN data){ //CONSTRUCTOR
        this.data=data;
//        this.next=null;  //TRUE BY DEFAULT
    }

}

