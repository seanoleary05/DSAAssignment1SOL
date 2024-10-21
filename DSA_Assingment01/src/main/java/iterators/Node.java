package iterators;

public class Node<K> {
        public Node<K> next = null;
        private K data;


         public Node(K data){
            this.data=data;
            this.next=null;
        }

        public K getData() {return data;}
        public void setData(K d) {this.data = d;}





    }
