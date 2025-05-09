public class StackLinkList implements Stack{

    StackItem top ;

    @Override
    public void push(Object item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }

    @Override
    public Object pop() {
        Object tempData = top.getData();
        top = top.getNext();
        return null;
    }

    @Override
    public void peek() {
        System.out.println("The top is"+ this.top.getData());
    }

    @Override
    public Boolean isEmpty() {
        return this.top == null;
    }
}
