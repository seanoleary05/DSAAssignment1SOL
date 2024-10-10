package iterators;
import lists.ShowList;
import models.Show;

public class ShowNode<K> {
        public ShowNode<K> next = null;
        private K contents;

        public K getContents() {return contents;}
        public void setContents(K c) {this.contents = c;}



    }
