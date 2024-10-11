package StoreToHeaven;

public class Coffin extends Product {
    private int size;
    
    public Coffin(String name,String pattern,String detail,String path){
        super(name,pattern,detail,path);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
