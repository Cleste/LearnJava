package ch9.QueuesExc;

public abstract class MasterQueue {
    private char[] queueArr;
    private int putIndex, getIndex;
    private String name = "none";

    public abstract char get() throws QueueEmptyException;
    public abstract void put(char sumb) throws QueueFullException;
    MasterQueue(int size, String name) {
        queueArr = new char[size + 1];
        setName(name);
        reset();
    }
    public void showContent() throws QueueEmptyException {
        messageList("Nqm1");
        while (getGetIndex() != getPutIndex()){
            System.out.print(get() + " ");
        }
        System.out.println();
    }


    public void showContent(int to) throws QueueEmptyException {
        messageList("Nqm1");
        int i = 0;
        while (i < to){
            System.out.print(get() + " ");
            i++;
        }
        System.out.println();
    }

    public char[] arrExpansionTwice(char[] old) {
        char[] arrNew = new char[old.length * 2];
        for (int i = 0; i < old.length; i++)
            arrNew[i] = old[i];

        return arrNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reset() {
        putIndex = getIndex = 0;
    }

    public void incPutInd() {
        putIndex++;
    }

    public void incGetInd() {
        getIndex++;
    }

    public void setGetIndex(int getIndex) {
        this.getIndex = getIndex;
    }

    public void setQueueArr(char[] queueArr) {
        this.queueArr = queueArr;
    }

    public void setPutIndex(int putIndex) {
        this.putIndex = putIndex;
    }

    public void fillQueue() throws QueueFullException {
        for (int i = 0; i < queueArr.length - 1; i++) {
            put((char) (i + 'A'));
        }
    }

    public void fillQueue(int from, int to) throws QueueFullException {
        for (int i = 0; i < to - from; i++) {
            put((char) (i + 'A' + from));
        }
    }

    public int getGetIndex() {
        return getIndex;
    }

    public char[] getQueueArr() {
        return queueArr;
    }

    public int getPutIndex() {
        return putIndex;
    }

    public static void queueCopy(MasterQueue copyFrom, MasterQueue copyHere) {
        copyHere.setQueueArr(arrCopy(copyFrom.getQueueArr()));
        copyHere.setGetIndex(copyFrom.getGetIndex());
        copyHere.setPutIndex(copyFrom.getPutIndex());
        System.out.println("\nContent of " + copyFrom.name + " queue copied to " + copyHere.name + " queue");
    }

    public static char[] arrCopy(char[] copyFrom) {
        char[] copyHere = new char[copyFrom.length];
        for (int i = 0; i < copyFrom.length; i++) {
            copyHere[i] = copyFrom[i];
        }
        return copyHere;
    }

    void messageList(String messKey) {
        if ("Nqm1".equals(messKey)) {
            System.out.println("\n" + name + " queue content: ");
        } else {
            System.out.println("\n\n\tUnknown error, unregistered messKey: '" + messKey + "'!");
        }
    }
}
