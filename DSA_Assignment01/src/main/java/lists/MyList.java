package lists;


import models.Show;

public class MyList<K> {

    CustomList<Object> cList = new CustomList<>();

    public void startList(){
        cList.add(new Show<>("showtitle", 12, "Morning", "Evening", 12));
        cList.list();
    }





}
