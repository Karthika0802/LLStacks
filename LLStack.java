class LLStack{
    
    Node Head;
    Node Top;
    
    LLStack(Node node)
    {
        Head = node;
        Top = node;
    }
    
    void Push(int x){  //Adds node to Top
        Node node = new Node(x);
        if(Top != null)
        {
            node.prev = Top;
            Top.next = node;
            Top = node;
            Top.next = null;
        }
        else
        {
            Head = Top = node;
        }
       
    }
    
    int Pop(){
        
        if(Top != null)
        {
            Node ReturnNode = Top;
            Top = Top.prev;
            return ReturnNode.data;
        }
        else
        {
            System.out.println("There is nothing to pop");
            return 0;
        }
    
    }
    
    void PrintStack(){
        Node Temp = Head;
        while(Temp!=null){
            System.out.print(Temp.data+" ");
            Temp = Temp.next;
        }
        
    }
}