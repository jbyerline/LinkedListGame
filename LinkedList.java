public class LinkedList {

    Node headNode = null;

    public void addNode(int x, int y) {
        if(headNode == null){
            Node oBoat = new Node(x,y);
            headNode = oBoat;
        }
        else if(headNode.nextNode == null){
            Node oBoat = new Node(x,y);
            headNode.nextNode = oBoat;
        }
        else{
            Node tempBoat = headNode;
            while (tempBoat.nextNode != null){
                tempBoat = tempBoat.nextNode;
            }
            Node oBoat = new Node(x,y);
            tempBoat.nextNode = oBoat;
        }
    }

    public int count(){
        int returnValue = 0;
        Node tempBoat = headNode;
        while (tempBoat.nextNode != null){
            returnValue++;
            tempBoat = tempBoat.nextNode;
        }
        return returnValue;
    }

    public Node removeHead(){
        if(headNode != null) {
            Node tempBoat = headNode;
            headNode = headNode.nextNode;
            return tempBoat;
        }
        else{
            return headNode;
        }
    }

    public void display(){
        Node tempBoat = headNode;
        while (tempBoat.nextNode != null){
            System.out.println(tempBoat.getX() + " " + tempBoat.getY());
            tempBoat = tempBoat.nextNode;
        }
        if(tempBoat != null) {
            System.out.println(tempBoat.getX() + " " + tempBoat.getY());
        }
    }

}
