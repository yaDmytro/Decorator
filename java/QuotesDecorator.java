public class QuotesDecorator extends Decorator{ //це наший перший декоратор, який створює оболочку для нашого
    public  QuotesDecorator(PrinterInterface component){
        super(component);

    }
    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
        System.out.println("\t");
    }
}
