public class Stack {

    Node top;

    public Stack() {
        top = null;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.nextNode = top;
        top = temp;
        System.out.println("Insert Successfully");
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            System.exit(1);
        }
        System.out.println(top.data);
        top = top.nextNode;
    }


    private boolean isEmpty(){
        return top == null;
    }

}
