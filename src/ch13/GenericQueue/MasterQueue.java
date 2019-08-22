package ch13.GenericQueue;

public abstract class MasterQueue<T> {
    private T[] queueArr;
    private int putIndex, getIndex;
    private String name = "none";

    public abstract T get() throws QueueEmptyException;

    public abstract void put(T var) throws QueueFullException;

    MasterQueue(T[] array, String name) {
        queueArr = array;
        reset();
        if(queueArr[getPutIndex()] != null) {
            setPutIndex(array.length - 1);
        }
        setName(name);

    }


    public void showContent() throws QueueEmptyException {
        messageList("Nqm1");
        while (getGetIndex() != getPutIndex()) {
            System.out.print(get() + " ");
        }
        System.out.println();
    }


    void showContent(int to) throws QueueEmptyException {
        messageList("Nqm1");
        int i = 0;
        while (i < to) {
            System.out.print(get() + " ");
            i++;
        }
        System.out.println();
    }

    Object arrExpansionTwice(T[] old) {
        Object[] arrNew = new Object[old.length * 2];
        System.arraycopy(old, 0, arrNew, 0, old.length);
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

    public void setQueueArr(T[] queueArr) {
        this.queueArr = queueArr;
    }

    public void setPutIndex(int putIndex) {
        this.putIndex = putIndex;
    }

    public void fillQueue(T[] array) throws QueueFullException {
        for (T x : array) {
            put(x);
        }
    }

    public int getGetIndex() {
        return getIndex;
    }

    public T[] getQueueArr() {
        return queueArr;
    }

    public int getPutIndex() {
        return putIndex;
    }

    private void messageList(String messKey) {
        if ("Nqm1".equals(messKey)) {
            System.out.println("\n" + name + " queue content: ");
        } else {
            System.out.println("\n\n\tUnknown error, unregistered messKey: '" + messKey + "'!");
        }
    }
}
