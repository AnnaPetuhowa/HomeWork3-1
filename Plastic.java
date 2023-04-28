public class Plastic extends Metal {
    public int getEndurance() {
        return 0;
    }

    public static class Sword<T extends Metal> {

        private final T metal;

        public Sword(T metal) {
            this.metal = metal;
        }

        public boolean checkEndurance() {
            return metal.getEndurance() > 49;
        }

    }

}
