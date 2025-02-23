package OopsConcepts.Constructor.ConstructorOveloading;

import org.w3c.dom.ls.LSOutput;

class Message {
    String msg;
    int time;

    public Message(String msg, int time) {
        this.msg = msg;
        this.time = time;
    }

    public Message() {

    }

    public Message(String msg) {
        this.msg = msg;
    }

    public Message(int time) {
        this.time = time;
    }
}

public class Example {
    public static void main(String[] args) {
        Message message = new Message();
        System.out.println("");
        Message message1 = new Message("Hi how are you");
        System.out.println(message1.msg);
        Message message2 = new Message(4);
        System.out.println(message2.time);
        Message message3 = new Message("Hi how are you", 5);
        System.out.println(message3.msg+" "+message3.time);

    }
}

