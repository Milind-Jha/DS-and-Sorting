package DataStructures2;

public class BubbleSortandSelectionSortLinkedList {
    public static GenericNode<Integer> SelectionSort(GenericNode<Integer> head) {
        GenericNode<Integer> selectionSortNode = head;
        GenericNode<Integer> temp = selectionSortNode.next;
        GenericNode<Integer> change;
        while(selectionSortNode.next!=null){
            temp = selectionSortNode.next;
            while(temp!=null){
                if(temp.data<selectionSortNode.data){
                    change = new GenericNode<Integer>(temp.data);
                    temp.data=selectionSortNode.data;
                    selectionSortNode.data=change.data;
                    temp=temp.next;
                }
                else{
                    temp=temp.next;
                }
            }
            selectionSortNode=selectionSortNode.next;
        }
        return head;
    }
    public static GenericNode<Integer> bubbleSort(GenericNode<Integer> head){
        public static GenericNode<Integer> bubbleSort(GenericNode<Integer> head) {
            //Your code goes here
            GenericNode<Integer> current = head, index = null;
            int temp;

            if(head == null) {
                return head;
            }
            else
            {
                while(current != null)
                {
                    //Node index will point to node next to current
                    index = current.next;

                    while(index != null)
                    {
                        //If current node's data is greater than index's node data, swap the data between them
                        if(current.data > index.data)
                        {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                        index = index.next;
                    }
                    current = current.next;
                }

            }  return head;
        }
    }
}
