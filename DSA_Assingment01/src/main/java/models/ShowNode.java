package models;

public class ShowNode<K> {
    public ShowNode<K> next=null;
    private K data;

    public K getData() { return data;}
    public void setData(K data) { this.data = data;}
}
