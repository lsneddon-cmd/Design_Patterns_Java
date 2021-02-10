package Creational.Builer;

public class BuilderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat")
                .condiments("lettuce")
                .dressing("mayonnaise")
                .meat("pastrami");

        LunchOrder lunch = builder.build();

        System.out.println(lunch);
    }
}
