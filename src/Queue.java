class QueueTeller {

    int size = 0;
    NodeTeller head;
    NodeTeller tail;

    public QueueTeller(){
        head = null;
        tail = null;
    }

    public void enqueueTeller(String keperluan, String tanggal, int no){
        NodeTeller node = new NodeTeller(keperluan, tanggal, no);

         if (head == null){
             head = node;
             tail = node;
         }else {
             tail.next = node;
             tail = node;
         }

         size++;
    }

    public void dequeueTeller(){
        if (head != null){
            head = head.next;
            size--;
        }
    }

    public int getSizeTeller(){
        return size;
    }

    public void displayTeller(){
        if (head == null){
            System.out.println("Tidak Ada Antrial Lagi!");
        }else {
            NodeTeller temp = head;
            System.out.println("=====================================");
            System.out.println("| Anda Melayani Antrian No.: " + temp.no );
            System.out.println("| Antrian Sedang Menunggu: " + (size - 1));
            System.out.println("=====================================");
            System.out.println();
        }
    }
}

class QueueCs {

    int size = 0;
    NodeCs head;
    NodeCs tail;

    public QueueCs(){
        head = null;
        tail = null;
    }

    public void enqueueCs(String keperluan, String tanggal, int no){
        NodeCs node = new NodeCs(keperluan, tanggal, no);

        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void dequeueCs(){
        if (head != null){
            head = head.next;
            size--;
        }
    }

    public int getSizeCs(){
        return size;
    }

    public void displayCs(){
        if (head == null){
            System.out.println("Tidak Ada Antrial Lagi!");
        }else {
            NodeCs temp = head;
            System.out.println("=====================================");
            System.out.println("| Anda Melayani Antrian No. : " + temp.no);
            System.out.println("| Antrian Sedang Menunggu: " + (size - 1));
            System.out.println("=====================================");
            System.out.println();

        }
    }
}

