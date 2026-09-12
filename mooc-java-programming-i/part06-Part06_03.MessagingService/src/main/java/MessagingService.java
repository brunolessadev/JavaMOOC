import java.util.ArrayList;

public class MessagingService {

    private final ArrayList<Message> messageArray = new ArrayList<>();

    public MessagingService() {
    }

    public void add(Message message){

        if(message.getContent().length() <= 280){
            messageArray.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return messageArray;
    }

}
