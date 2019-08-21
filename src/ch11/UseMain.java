package ch11;

public class UseMain {
    public static void main(String[] args) {
        Thread thread;
        thread = Thread.currentThread();
        System.out.println("Main stream name: " + thread.getName()+ "\nMain thread priority: " + thread.getPriority()+
                "\nSetting the name and priority of the main stream\n");

        thread.setName("Stream #1");
        thread.setPriority(Thread.NORM_PRIORITY + 2);

        System.out.println("New main stream name: " + thread.getName()+
                "\nNew main stream priority: " + thread.getPriority());
    }
}
