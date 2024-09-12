class OddNumberThread extends Thread {
    private int limit;

    public OddNumberThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        OddNumberThread oddThread = new OddNumberThread(10);
        oddThread.start();
    }
}
