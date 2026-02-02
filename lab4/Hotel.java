class Hotel{
    static int rooms;
    public Hotel( int rooms){
        this.rooms=rooms;
    }
    public synchronized void bookRoom(String name){
        while( rooms==0){
            try{
                System.out.println(name+ " is waiting for a room...");
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        rooms --;
        System.out.println(name+ " booked a room; rooms left: " +rooms);
    }
    

    public synchronized void releaseRoom(String name){
        rooms++;
        System.out.println(name + " released a room; vacant rooms: "+rooms);
    }
}
