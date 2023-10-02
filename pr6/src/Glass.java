public class Glass extends Dish {
    private boolean handle;
    public Glass(String color, int size, String material, boolean handle){
        super(size, color, material);
        this.handle = handle;
    }

    public boolean isHandle() {
        return handle;
    }

    @Override
    public void usage(){
        System.out.println("Стакан");
    }
}
