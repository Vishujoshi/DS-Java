package LLpack;

public class singleLL {
       public Node head=null;
       public Node tail= null;
       int l=0;
    public void createSingleLL(int value){
        Node newnode =new Node();
        newnode.data=value;
        if(head==null){
            head=newnode;
            tail=newnode;
            newnode.next=null;
            l++;
            System.out.println("linklist created");
        }
        else {
            tail.next=newnode;
            tail=newnode;
            tail.next=null;
            l++;
            System.out.println("added at tail position");
        }

    }

    public void printList(){
        Node temp=head;
        if(temp==null){
            System.out.println("List is empty");
        }
        else {
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }
            System.out.println();
        }


    }

    public void search(int value){
        int index=0;
        Node temp=head;

        while(temp!=null){
            if(temp.data==value){
                System.out.println("Value Found at index " + index);
                return;
            }

            temp=temp.next;
            index++;
        }
        System.out.println("Value Not Found");

    }

    public void prepend(int value) {
        Node newnode = new Node();
        newnode.data = value;
        if (head == null) {
            head = newnode;
            tail = newnode;
            newnode.next = null;
            l++;
            System.out.println("Appended at first when head is null");
        } else {
            newnode.next = head;
            head = newnode;
            l++;
            System.out.println("Appended at first when head has element");
        }
    }

        public void append(int value){
            Node newnode = new Node();
            newnode.data=value;
            if(tail==null){
                head=newnode;
                tail=newnode;
                newnode.next=null;
                l++;
                System.out.println("Appended at first when tail is null");
            }
            else{
                tail.next=newnode;
                newnode.next=null;
                tail=newnode;

                l++;
                System.out.println("Appended at last when tail has element");
            }

    }


    public void insert(int index, int value){
        Node temp=head;
        Node newnode=new Node();
        newnode.data=value;

            int listindex=1;
            if(index==0){
                prepend(value);
            } else if (index==l) {
                append(value);

            }

            else if(index>0&&index<l){

                while(temp!=null){
                    if(index==listindex){
                        newnode.next=temp.next;
                        temp.next=newnode;

                        l++;
                        System.out.println("Added at given index");
                        return;
                    }
                    temp=temp.next;
                    listindex++;
                }


            }
             else{
                System.out.println("Cannot add as Index value is greater than length " + l);
            }


    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("No element Present");
        } else if(l==1) {
            head=null;
            tail=null;
            l--;
        }
        else
            {
//            Node temp=null;
                head=head.next;
//            head=temp;

                l--;
                System.out.println("Deleted first element");
            }
        }

    public void removeLast(){
        if (head == null) {
            System.out.println("No element Present");
        } else if(l==1) {
            head=null;
            tail=null;
            l--;
        }
        else
        {
            Node temp=head;
            while(temp!=null){
                if(temp.next==tail){
                    temp.next=null;
                    tail=temp;

                }
                temp=temp.next;
            }


//            head=temp;

            l--;
            System.out.println("Deleted last element");
        }
    }


    public void delete(int index){
        if(index==0){
            removeFirst();
        } else if (index==l) {
            removeLast();
        }
        else{
            Node temp=head;
            Node refNext=null;
            for (int i = 1; i < index; i++) {
                temp=temp.next;

            }

            temp.next=temp.next.next;
            System.out.println("Deleted at given index");
        }
    }

    public void deleteLL(){
        head=null;
        tail=null;
        l=0;
        System.out.println("Link list deleted");
    }

    public void reverse(){
       Node temp=head;
       head=tail;
       tail=temp;
       Node after=temp.next;
       Node before=null;
        for (int i = 0; i < l; i++) {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;

        }
        System.out.print("Reverse list is as ------");
        printList();
    }


}
