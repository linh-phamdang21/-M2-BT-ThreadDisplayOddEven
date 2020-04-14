public class EvenThread extends Thread {
    public EvenThread(){

    }

    @Override
    public void run() {
        System.out.println("EvenNumber From 1 to 10: ");
        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println(i);
                try{
                    Thread.sleep(15);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
