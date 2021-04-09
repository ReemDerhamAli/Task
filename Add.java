/**
 * Created by Alia on 28/02/2021.
 */
public class Add {
    private static class Node<Int> {
        private Int element;
        private Node<Int> next;
        private Node<Int> penultimate;

        public Node(Int e, Node<Int> n) {
            element = e;
            next = n;
            penultimate = null;
        }

        public Int getElement() {
            return element;
        }

        public Node<Int> getNext() {
            return next;
        }

        public void setNext(Node<Int> n) {
            next = n;
        }

        public Node<Int> getPenultimate(Node<Int> head) {
            Node<Int> current = head;
            while (current != null) {
                if (head.getNext() == null) {
                    penultimate = head;
                } else {
                    current = current.getNext();
                }
            }
            return penultimate;
        }
    }
    private Node<Int> head = null;
    private Node<Int> tail= null;
    private int size =0;

    public Add()
    {
    }
    public int size()
    {
        return size;
    }
    public boolean isEmbty()
    {
        return size==0;
    }
    public Int first()
    {
        if (isEmbty()){
            return null
        }
        return head.getElement();
    }
    public Int last()
    {
        if (isEmbty()){
            return null;
        }
        return tail.getElement();
    }
    public void addFirst(Int i)
    {
        head=new Node<Int>(i,head);
        if (size==0){
            tail=head;
        }
        size++;
    }
    public void addLast(Int i){
        Node<Int> newest = new Node<Int>(i,null);
        if (isEmbty()){
            head=newest;
        }else {
            tail.setNext(newest);
            tail=newest;
            size++;
        }
    }
    public Int removeFirst(){
        if (isEmbty()){
            return  null;
        }
        Int add=head.getElement();
        head=head.getNext();
        size--;
        if (size==0){
            tail=null;
        }
        return add;
    }
    public void getPenultimate(){
        if (isEmbty()){
            System.out.println("list is empty ");
        }
        else {
            System.out.println("the last node is:"+ head.penultimate(head));
        }
    }
}