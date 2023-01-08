package clothes;

import enumeration.Size;

abstract class Clothes {
    private String material;
    private Size size;

    @Override
    public int hashCode(){
        return this.material.hashCode();
    }

    @Override
    public String toString(){
        return size + "";
    }

    public Clothes(Size size, String material){
        this.size = size;
        this.material = material;
    }

    public Size getSize(){
        return size;
    }

    public String getMaterial(){
        return material;
    }

}
