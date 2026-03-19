package demo.StructuralPatterns.BehaviorPattern;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    static void main(String[] args) {
        ReceiverObserver r1 = new ConcreteReceiver("ok1");
        ReceiverObserver r2 = new ConcreteReceiver("ok2");

        SourceNews news = new SourceNews();

        news.addReveiver(r1);
        news.addReveiver(r2);
        news.sendNews();
    }
}

// đối tượng nhập
interface ReceiverObserver{
    public void update(String news);
}

// nguồn tin tức
class SourceNews{
    private List<ReceiverObserver> observers = new ArrayList<ReceiverObserver>();
    public void addReveiver(ReceiverObserver observer){
        observers.add(observer);
    }
    public void sendNews(){
        String content = "ok";
        observers.forEach(v -> v.update(content));
    }
}


// Người nhận chi tiết
class ConcreteReceiver implements ReceiverObserver{
    private String name;

    public ConcreteReceiver(String name) {
        this.name = name;
    }


    @Override
    public void update(String news) {
        System.out.println(name + " Đã nhận bài viết : " + news);
    }
}