class Q1Running implements Runnable {
    public void run() { 
        int i=1;
        while(i<10)
        {
            System.out.println(i +"hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Q1Running t1 = new Q1Running();
        Thread th = new Thread(t1);
        th.start();
        System.out.println("Succesfully Created Thread Using Runnable");
    }
       
    }

