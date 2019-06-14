public class Node {
    private int xPosition;
    private int yPosition;
    Node nextNode = null;
    public Node(int x, int y){
        xPosition = x;
        yPosition = y;
    }
    public void setValues(int x,int y){
        xPosition = x;
        yPosition = y;
    }
    public int getX(){
        return xPosition;
    }
    public int getY(){
        return yPosition;
    }
}
