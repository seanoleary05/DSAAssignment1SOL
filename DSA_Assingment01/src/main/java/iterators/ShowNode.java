package iterators;

public class ShowNode<K> {
        public ShowNode<K> next = null;
        private K data;


         public ShowNode(K data){
            this.data=data;
            this.next=null;
        }

        public K getData() {return data;}
        public void setData(K c) {this.data = c;}



    }
