public class inheritance1 {
    public static void main(String[] args) {


        Poco_Phones Model1 = new Poco_Phones();
        Samsung_Phones Model2 = new Samsung_Phones();
        Apple_Phones Model3= new Apple_Phones();
        Realme_Phones Model4 = new Realme_Phones();


        Model1.Poco_X3Pro();
        Model1.Poco_X4Pro();
        Model1.Poco_X5Pro();
        Model2.Sam_M11();
        Model2.Sam_A30();
        Model2.Sam_A54();
        Model3.Apple_Iphone11();
        Model3.Apple_Iphone12();
        Model3.Apple_Iphone13_ProMax();
        Model3.Apple_Iphone16_ProMax();
        Model4.Realme_Narzo_70_Pro();
        Model4.Realme_SE();

    }
}

class Phones {
    public void Phone(){
        System.out.println("Phone Launched");
    }
    }
           class Samsung_Phones extends Phones {
                public void Sam_M11() {
                    System.out.println("Samsung M11 New Model Phone Created");
                    super.Phone();
                }
                public void Sam_A54(){
                        System.out.println("Samsung A54 New Model Phone Created");
                        super.Phone();
                }
               public void Sam_A30(){
                   System.out.println("Samsung A30 New Model Phone Created");
                   super.Phone();
            }}

            class Poco_Phones extends Phones {
                public void Poco_X4Pro(){
                    System.out.println("Poco X4 Pro New Model Phone Created");
                    super.Phone();
                }
                public void Poco_X3Pro(){
                    System.out.println("Poco X3 Pro New Model Phone Created");
                    super.Phone();
            }
                public void Poco_X5Pro() {
                    System.out.println("Poco X5 Pro New Model Phone Created");
                    super.Phone();
                }}
            class Realme_Phones extends Phones {
                public void Realme_SE() {
                    System.out.println("Realme SE New Model Phone Created");
                    super.Phone();
                }

                public void Realme_Narzo_70_Pro() {
                    System.out.println("Realme Narzo New Model Phone Created");
                    super.Phone();
                }
            }



            class Apple_Phones extends Phones {

                public void Apple_Iphone11() {
                    System.out.println("Apple Iphone 11 New Model Phone Created");
                    super.Phone();
                }

                public void Apple_Iphone12() {
                    System.out.println("Apple Iphone 12 New Model Phone Created");
                    super.Phone();
                }

                public void Apple_Iphone13_ProMax(){
                    System.out.println("Apple Iphone 13 ProMax New Model Phone Created");
                    super.Phone();
                }
                public void Apple_Iphone16_ProMax(){
                    System.out.println("Apple Iphone 16 New Model Phone Created");
                    super.Phone();
                }}
