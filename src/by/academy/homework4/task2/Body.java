package by.academy.homework4.task2;

public class Body {

    public Heart heart;

    public Lungs lungs;

    public Body() {
        this.heart = new Heart();
        this.lungs = new Lungs();
    }

    void live(){
        lungs.live();
        heart.live();
        System.out.println("""
                You stand on the shore and feel the salty smell of the wind that blows from the sea.\s
                And I believe that you are free, and life has only begun.
                """);
    }
    class Heart{
        public void live(){
            for(int i = 0; i < Integer.MAX_VALUE; i++){
                if (i % 100 == 0){
                    System.out.println(i + ": Knock-knock-knockin' on heaven's door");
                }

            }
        }
    }

    class Lungs {
        public void live(){
            for(int i = 0; i < Integer.MAX_VALUE; i++){
                if (i % 50 == 0){
                    System.out.println(i + ": breathe in");
                } else if (i % 100 == 0) {
                    System.out.println(i + ": breathe out");

                }

            }
        }

    }

}
