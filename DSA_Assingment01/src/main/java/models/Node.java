package models;

public class Node<S> {
    public Node next=null; //Or private with getter/setter methods
    private S contents; //ADT reference!
    public Object getContents() { return contents; }
    public void setContents(S c) { contents=c;}

}
