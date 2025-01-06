public class lengthofList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode (int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current !=null){
            System.out.print(current.data+" ----->");
            current=current.next;

        }
        System.out.print("null  ");
    }


    public int length(){
        if(head==null){
            return 0;
        }
        int count =0;
        ListNode current =head;
        while(current!=null){
            count++;
            current= current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        lengthofList sl=new lengthofList();
        sl.head=new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third=new ListNode(20);
        ListNode fourth=new ListNode(40);

        //now lets connect together

        sl.head.next=second;
        second.next=third;
        third.next=fourth;
        sl.display();
        System.out.println("Length of the list is :"+sl.length());
    }
}
