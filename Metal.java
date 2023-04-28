public abstract class Metal {
    public abstract int getEndurance();
    public static class Steel extends Metal {
        public int getEndurance() {
            return 0;
        }
    }
    public class Copper extends Metal {
        public int getEndurance() {
            return 20;
        }
    }
    public class Iron extends Metal {

        public int getEndurance() {
            return 30;
        }
    }
}
