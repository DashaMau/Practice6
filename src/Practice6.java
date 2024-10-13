public class Practice6 {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(42);
        temperature.convert();
    }
    public interface Convertable{
        void convert();
    }

    public static class Temperature implements Convertable{
        private double Cels;
        public Temperature(double temp){
            this.Cels = temp;
        }

        @Override
        public void convert() {
            double Fareng = this.Cels*9/5 + 32;
            double Kelvin = this.Cels + 273.15;
            System.out.println("Цельсий Фаренгейт Кельвин");
            System.out.println("   " + this.Cels + "    " + Fareng + "   " + Kelvin);
        }
    }
}
