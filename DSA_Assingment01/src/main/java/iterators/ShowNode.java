package iterators;

public class ShowNode<K> {
        public ShowNode<K> next = null;
        private K show;

        public K getContents() {return show;}
        public void setContents(K s) {this.show = s;}



    }
