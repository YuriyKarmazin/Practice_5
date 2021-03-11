public abstract class Phone {
    private String model;

    public String getModel() {
        return model;
    }

    public Phone(String model) {
        this.model = model;
    }
    public abstract void toCall();
}

    class Iphone extends Phone{

        public Iphone(String model) {
            super(model);
        }
        public void toCall(){
            System.out.println("Iphone call");
    }
}

    class Samsung extends Phone{

        public Samsung(String model) {
            super(model);
        }
        public void toCall(){
            System.out.println("Samsung call");
        }
}

class Program{
    public static void main(String[] args) {
        Phone iphoneX12 = new Iphone("X12");
        Phone samsungS20 = new Samsung("S20");
        iphoneX12.toCall();
        samsungS20.toCall();
        System.out.println();
        System.out.println(iphoneX12.getModel());
        System.out.println(samsungS20.getModel());

    }
}


