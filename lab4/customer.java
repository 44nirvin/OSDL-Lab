class customer extends Thread{
    private Hotel hotel;
    private String name;
    public customer(Hotel hotel, String n){
        this.hotel=hotel;
        this.name=n;
    }
    public void run(){
        hotel.bookRoom(name);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        hotel.releaseRoom(name);
    }
}

