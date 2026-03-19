package demo.StructuralPatterns.Facade;


public class Facade{
    static void main(String[] args) {
        FacadeRestaurant facadeRestaurant = new FacadeRestaurant();
        facadeRestaurant.order();
        facadeRestaurant.pay();
    }
}

class FacadeRestaurant {
    private Chef chef = new Chef();
    private Staff staff = new Staff();
    private Mangement mangement = new Mangement();
    void order(){
        staff.order();
        chef.cook();

    }

    void pay(){
        staff.invoice();
        mangement.feedBack();
        mangement.complainToChef();
    }
}

class Chef{
    public void cook(){
        System.out.println("Cooking");
    }
}

class Staff{
    public void order(){
        System.out.println("Ordering");
    }

    public void invoice(){
        System.out.println("Invoice");
    }
}

class Mangement{
    public void feedBack(){
        System.out.println("Feedback");
    }

    public void complainToChef(){
        System.out.println("Complain to chef");
    }
}
