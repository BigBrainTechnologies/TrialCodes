package basicPrograms;

public enum TrafficSignalColor {
    RED("stop") {
        public void doAction() {
            System.out.println("Stopping..." );
        }
    },
    YELLOW("slow down") {
        public void doAction() {
            System.out.println("Slowing down...");
        }
    },
    GREEN("go") {
        public void doAction() {
            System.out.println("Going...");
        }
    };

    private final String action;

    private TrafficSignalColor(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public abstract void doAction();
}

