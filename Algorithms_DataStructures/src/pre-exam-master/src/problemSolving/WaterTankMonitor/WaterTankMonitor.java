package problemSolving.WaterTankMonitor;

class WaterTank {
    boolean empty;

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}

class WaterTankMonitor {

    public static void main(String[] args) {
        WaterTankMonitor waterTank = new WaterTankMonitor(new WaterTank());
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    waterTank.fill();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    WaterTank tank;

    WaterTankMonitor(WaterTank tank) {
        this.tank = tank;
    }

    synchronized void empty() throws InterruptedException {
        while (tank.isEmpty()) {
            wait();
        }

        tank.setEmpty(true);
        notifyAll();
    }

    synchronized void fill() throws InterruptedException {
        while (!tank.isEmpty()) {
            wait();
        }

        tank.setEmpty(false);
        notifyAll();
    }
}
